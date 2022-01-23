package tv.codely.mooc.courses.application.create;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.courses.domain.*;

import static org.mockito.Mockito.*;

final class CourseCreatorShould {
    @Test
    void create_a_valid_course() {
        CourseRepository repository = mock(CourseRepository.class);
        CourseCreator    creator    = new CourseCreator(repository);

        CourseId id = new CourseId("52ab832e-7641-11ec-90d6-0242ac120003");
        CourseName name = new CourseName("name");
        CourseDuration duration = new CourseDuration("duration");

        Course course = new Course(id, name, duration);

        creator.create(new CreateCourseRequest(id.value(), name.value(), duration.value()));

        verify(repository, atLeastOnce()).save(course);
    }
}
