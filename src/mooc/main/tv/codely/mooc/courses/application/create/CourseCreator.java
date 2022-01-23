package tv.codely.mooc.courses.application.create;

import tv.codely.mooc.courses.domain.*;
import tv.codely.shared.domain.Service;

@Service
public final class CourseCreator {
    private final CourseRepository repository;

    public CourseCreator(CourseRepository repository) {
        this.repository = repository;
    }

    public void create(CreateCourseRequest courseRequest) {
        Course course = new Course(new CourseId(courseRequest.id()), new CourseName(courseRequest.name()), new CourseDuration(courseRequest.duration()));
        this.repository.save(course);
    }
}
