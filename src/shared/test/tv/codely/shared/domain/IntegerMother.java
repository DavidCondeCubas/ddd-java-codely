package tv.codely.shared.domain;

import java.util.Random;

public final class IntegerMother {
    public static Integer random(){
        return new Random().nextInt();
    }
    public static Integer random(int a, int b){
        return (int)Math.floor(Math.random()*(b-a+1)+a);
    }
}
