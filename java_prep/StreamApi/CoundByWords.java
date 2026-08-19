package java_prep.StreamApi;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;



public class CoundByWords {
    public static void main(String[] args) {

        String name="ganeshkumar";
Map<Character,Long> result=name.chars()

                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(
                Function.identity(),
                TreeMap::new,
                Collectors.counting()

        ));


        System.out.println(result);

    }
}
