package tv.codely.mooc.courses.domain;

import static org.junit.jupiter.api.Assertions.*;

public final class CourseMother {
    public static Course create(String value){
        return new Course(value);
    }
    public static Course random(){
        return create(WordMother.random());
    }
}
