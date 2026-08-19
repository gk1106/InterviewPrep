package java_prep.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class evenOdd {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8
        );


        Map<String,List<Integer>> result=nums.stream()
                .collect(Collectors.groupingBy(
                        n->n%2==0?"Even":"odd"




                ));

        System.out.println(result);

    }
}
