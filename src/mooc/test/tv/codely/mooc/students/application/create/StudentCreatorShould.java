package tv.codely.mooc.students.application.create;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.courses.application.create.CreateCourseRequest;
import tv.codely.mooc.students.domain.*;

import static org.mockito.Mockito.*;

class StudentCreatorShould {

    @Test
    void create_an_student() {
        StudentRepository studentRepository = mock(StudentRepository.class);
        StudentCreator studentCreator = new StudentCreator(studentRepository);

        StudentId id = new StudentId("52ab832e-7641-11ec-90d6-0242ac120003");
        StudentFirstName firstName = new StudentFirstName("some-first-name");
        StudentLastName lastName = new StudentLastName("some-last-name");
        StudentDni dni = new StudentDni("some-dni");

        Student student = new Student(id, firstName, lastName, dni);

        studentCreator.create(new CreateStudentRequest(id.value(),firstName.value(),lastName.value(),dni.value()));
        verify(studentRepository, atLeastOnce()).save(student);
    }
}
