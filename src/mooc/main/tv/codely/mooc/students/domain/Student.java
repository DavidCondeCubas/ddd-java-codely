package tv.codely.mooc.students.domain;

import java.util.Objects;

public final class Student {

    private final StudentId id;
    private final StudentFirstName firstName;
    private final StudentLastName lastName;
    private final StudentDni dni;

    public Student(StudentId id, StudentFirstName firstName, StudentLastName lastName, StudentDni dni) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
    }

    public StudentId id() {
        return id;
    }

    public StudentFirstName firstName() {
        return firstName;
    }

    public StudentLastName lastName() {
        return lastName;
    }

    public StudentDni dni() {
        return dni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id) && firstName.equals(student.firstName) && lastName.equals(student.lastName) && dni.equals(student.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, dni);
    }
}

