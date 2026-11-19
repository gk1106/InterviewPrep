package java_prep.InterviewPrepare;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHigh {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                10, 50, 30, 80, 80, 40
        );

        Integer result= numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);

        System.out.println(result);


    }
}
