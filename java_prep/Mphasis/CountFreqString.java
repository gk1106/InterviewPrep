package java_prep.Mphasis;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFreqString {
    public static void main(String[] args) {


        String name="malayalam";


        Map<Character,Long> res=name.chars().mapToObj(n->(char)n)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        TreeMap::new,
                        Collectors.counting()

                ));

        System.out.println(res);
    }

}



