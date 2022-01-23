package tv.codely.shared.domain;

import java.util.Arrays;

public final class RandomElementPicker {
    public static String from(String ...elements){
        return Arrays.stream(elements).filter(s -> true).toString();
    }
}
