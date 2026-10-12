package java_prep.InterviewPrepare;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class nonRepChar {
    public static void main(String[] args) {

        String str = "aabbcdeef";
// o(n2)
//        Character result=str.chars()
//                .mapToObj(c->(char)c)
//                .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
//                //.skip(1)   --to find second non rep char
//                .findFirst()
//                .orElse(null);

        //o(n) -minimal solution

        Character result=str.chars()
                        .mapToObj(c->(char)c)
                                .collect(Collectors.groupingBy(
                                        c->c,
                                         LinkedHashMap::new,
                                        Collectors.counting()

                                ))

                                        .entrySet()
                                                .stream()
                .filter(c->c.getValue() == 1)
                .map(Map.Entry::getKey)

                                                        .findFirst()
                                                                .orElse(null);


        System.out.println(result);

    }
}
