package java_prep.streamApiPrograms;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class OccuranceChar {
    //6. Count the occurrence of each character
    public static void main(String[] args) {
        String str = "programming";



        Map<Character,Long> res=str.chars().mapToObj(c->(char)c)
                        .collect(Collectors.groupingBy(
                                n->n,
                                TreeMap::new,
                                Collectors.counting()
                        ));

        //show only occurance more that 1

                    List< Map.Entry<Character,Long>> finRes=res.entrySet().stream()

                                     .filter(n->n.getValue() >1)
                                             .toList();
//        Map<Character, Long> finRes = res.entrySet()
//                .stream()
//                .filter(n -> n.getValue() > 1)
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        Map.Entry::getValue,
//                        (a, b) -> a,
//                        TreeMap::new
//                ));





        System.out.println(res);
        System.out.println(finRes);



    }
}
