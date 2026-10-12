package java_prep.InterviewPrepare;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCount {
    public static void main(String[] args) {

        String name="Ganeshkumar";


        Map<Character, Long> map=name.toLowerCase().chars()
                .mapToObj(n->(char) n)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                       TreeMap::new,
                       Collectors.counting()


                ));

        System.out.println(map);


    }
}
