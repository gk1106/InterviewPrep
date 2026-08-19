package java_prep.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class program {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Arun", "Bob", "Anu", "David", "Alex", "Sam"
        );



       Map<Integer,Long> result= names.stream()
                       .collect(Collectors.groupingBy(
                               String::length
                               ,Collectors.counting()


                       ));

        System.out.println(result);


    }
}
