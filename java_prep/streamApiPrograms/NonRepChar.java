package java_prep.streamApiPrograms;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class NonRepChar {
    public static void main(String[] args) {
//2. Find the first non-repeated character in a string

        String str = "swiss";

        Character res=str.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(
                        n->n,
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet().stream()
                .filter(n->n.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(res);


    }

}
