package java_prep.streamApiPrograms;

import java.util.*;
import java.util.stream.Collectors;

public class OddandEven {
    public static void main(String[] args) {
        //Separate even and odd numbers

        List<Integer> numbers = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8
        );

        Map<String,List<Integer>> res=new TreeMap<>();

        res=numbers.stream()
                .collect(Collectors.groupingBy(
                        n->n % 2==0 ?"even":"odd",
                        Collectors.toList()


                ));

        System.out.println(res);

    }
}
