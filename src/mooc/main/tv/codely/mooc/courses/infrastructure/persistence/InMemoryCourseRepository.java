package tv.codely.mooc.courses.infrastructure.persistence;

import tv.codely.mooc.courses.domain.Course;
import tv.codely.mooc.courses.domain.CourseId;
import tv.codely.mooc.courses.domain.CourseRepository;
import tv.codely.shared.domain.Repository;

import java.util.HashMap;
import java.util.Optional;

@Repository
public final class InMemoryCourseRepository implements CourseRepository {
    private HashMap<String, Course> courses = new HashMap<>();

    @Override
    public void save(Course course) {
        courses.put(course.id().value(), course);
    }

    public Optional<Course> search(CourseId id) {
        return Optional.ofNullable(courses.get(id.value()));
    }
}
