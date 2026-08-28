package java_prep.programsInter;

import java.util.Arrays;
import java.util.List;

public class maxim {
    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 50, 20, 80, 30);



        Integer maximum = numbers.stream()
                .max(Integer::compareTo).get();
    }
}
