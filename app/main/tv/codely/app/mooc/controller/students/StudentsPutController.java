package tv.codely.app.mooc.controller.students;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tv.codely.mooc.students.application.create.CreateStudentRequest;
import tv.codely.mooc.students.application.create.StudentCreator;

import java.util.Objects;

@RestController
public final class StudentsPutController {

    StudentCreator studentCreator;

    public StudentsPutController(StudentCreator studentCreator) {
        this.studentCreator = studentCreator;
    }

    @PutMapping(value = "/students/{id}")
    public ResponseEntity create(@PathVariable String id, @RequestBody Request requestUser) {
        studentCreator.create(new CreateStudentRequest(id, requestUser.dni(), requestUser.firstName(), requestUser.lastName()));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}

final class Request {
    String firstName;
    String lastName;
    String dni;

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public String dni() {
        return dni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        return Objects.equals(firstName, request.firstName) && Objects.equals(lastName, request.lastName) && Objects.equals(dni, request.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dni);
    }
}
