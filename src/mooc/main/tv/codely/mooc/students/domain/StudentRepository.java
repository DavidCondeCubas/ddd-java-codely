package tv.codely.mooc.students.domain;

import java.util.Optional;

public interface StudentRepository {
    void save(Student user);
    Optional<Student> search(String id);
}
