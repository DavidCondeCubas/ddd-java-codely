package tv.codely.mooc.courses.domain;

public class CourseNameMother {
    public static CourseName create(String value){
        return new CourseName(value);
    }
    public static CourseName ramdom(){
        return create(WordMother.random());
    }
}
