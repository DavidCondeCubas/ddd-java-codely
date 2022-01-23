package tv.codely.mooc.students.application.create;

import java.util.Objects;

public final class CreateStudentRequest {

    private final String id;
    private final String dni;
    private final String firstName;
    private final String lastName;

    public CreateStudentRequest(String id, String firstName, String lastName,  String dni) {
        this.id = id;
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String id() {
        return id;
    }

    public String dni() {
        return dni;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateStudentRequest that = (CreateStudentRequest) o;
        return id.equals(that.id) && dni.equals(that.dni) && firstName.equals(that.firstName) && lastName.equals(that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dni, firstName, lastName);
    }
}
