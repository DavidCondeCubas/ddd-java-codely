package tv.codely.mooc.students.infrastructure;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.students.domain.*;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryStudentRepositoryShould {

    @Test
    void create_a_correct_student() {
        InMemoryStudentRepository repository = new InMemoryStudentRepository();

        StudentId id = new StudentId("52ab832e-7641-11ec-90d6-0242ac120003");
        StudentFirstName firstName = new StudentFirstName("some-first-name");
        StudentLastName lastName = new StudentLastName("some-last-name");
        StudentDni dni = new StudentDni("some-dni");
        Student student = new Student(id, firstName, lastName, dni);

        repository.save(student);
    }

    @Test
    void search_an_existing_student() {
        InMemoryStudentRepository repository = new InMemoryStudentRepository();

        StudentId id = new StudentId("52ab832e-7641-11ec-90d6-0242ac120003");
        StudentFirstName firstName = new StudentFirstName("some-first-name");
        StudentLastName lastName = new StudentLastName("some-last-name");
        StudentDni dni = new StudentDni("some-dni");
        Student student = new Student(id, firstName, lastName, dni);

        repository.save(student);
        assertEquals(Optional.of(student), repository.search(id.value()));
    }

    @Test
    void search_an_unexisting_student() {
        InMemoryStudentRepository repository = new InMemoryStudentRepository();
        assertFalse(repository.search("missed_id").isPresent());
    }
}

