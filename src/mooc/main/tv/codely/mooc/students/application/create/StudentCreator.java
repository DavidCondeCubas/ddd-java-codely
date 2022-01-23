package tv.codely.mooc.students.application.create;

import tv.codely.mooc.students.domain.*;
import tv.codely.shared.domain.Service;

@Service
public final class StudentCreator {
    StudentRepository studentRepository;

    public StudentCreator(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void create(CreateStudentRequest studentRequest) {
        this.studentRepository.save(new Student(new StudentId(studentRequest.id()), new StudentFirstName(studentRequest.firstName()), new StudentLastName(studentRequest.lastName()), new StudentDni(studentRequest.dni())));
    }
}
