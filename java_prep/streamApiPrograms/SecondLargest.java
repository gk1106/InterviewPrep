package java_prep.streamApiPrograms;

import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
       // 3. Find the second-highest number in a list

        List<Integer> numbers = Arrays.asList(
                10, 50, 30, 80, 80, 40
        );

        Integer res=numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(res);


    }


}
