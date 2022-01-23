package tv.codely.mooc.students.infrastructure;


import tv.codely.mooc.students.domain.Student;
import tv.codely.mooc.students.domain.StudentRepository;
import tv.codely.shared.domain.Repository;

import java.util.HashMap;
import java.util.Optional;

@Repository
public class InMemoryStudentRepository implements StudentRepository {

    HashMap<String,Student> studentMap = new HashMap<>();

    @Override
    public void save(Student student) {
        studentMap.put(student.id().value(),student);
    }

    @Override
    public Optional<Student> search(String id) {
        return Optional.ofNullable(studentMap.get(id));
    }
}
