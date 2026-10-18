package java_prep.Mphasis;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHigh {
    public static void main(String[] args) {

        List<Integer> num= Arrays.asList(1,2,3,4,5);

        Integer result=num.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(result);

    }
}
