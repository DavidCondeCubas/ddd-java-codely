package tv.codely.app.mooc.controller.courses;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tv.codely.mooc.courses.application.create.CourseCreator;
import tv.codely.mooc.courses.application.create.CreateCourseRequest;

@RestController
public final class CoursesPutController {
    CourseCreator courseCreator;

    public CoursesPutController(CourseCreator courseCreator) {
        this.courseCreator = courseCreator;
    }

    @PutMapping(value = "/courses/{id}")
    public ResponseEntity create(@PathVariable String id, @RequestBody Request request) {
        courseCreator.create(new CreateCourseRequest(id, request.name(), request.duration()));
        return new ResponseEntity(HttpStatus.CREATED);
    }
}

final class Request {
    private String name;
    private String duration;

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String duration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
