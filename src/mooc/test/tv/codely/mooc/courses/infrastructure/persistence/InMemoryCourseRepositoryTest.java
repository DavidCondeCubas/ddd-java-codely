package tv.codely.mooc.courses.infrastructure.persistence;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.courses.domain.*;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryCourseRepositoryShould {

    @Test
    void save_a_valid_course() {
        InMemoryCourseRepository repository = new InMemoryCourseRepository();
        Course course = new Course(
            new CourseId("52ab832e-7641-11ec-90d6-0242ac120003"),
            CourseNameMother.random(),
            new CourseDuration("test-duration"));
        repository.save(course);
    }

    @Test
    void search_an_existing_course() {
        InMemoryCourseRepository repository = new InMemoryCourseRepository();
        Course courseTest = new Course(
            new CourseId("52ab832e-7641-11ec-90d6-0242ac120003"),
            new CourseName("test-name"),
            new CourseDuration("test-duration"));
        repository.save(courseTest);
        assertEquals(Optional.of(courseTest), repository.search(courseTest.id()));
    }

    @Test
    void search_a_missed_course() {
        InMemoryCourseRepository repository = new InMemoryCourseRepository();
        assertFalse(repository.search(new CourseId("52ab832e-7641-11ec-90d6-0242ac120003")).isPresent());
    }
}
