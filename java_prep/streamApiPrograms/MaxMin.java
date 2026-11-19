package java_prep.streamApiPrograms;

import java.util.*;
import java.util.stream.Collectors;

public class MaxMin {
    public static void main(String[] args) {

        //4. Find the maximum and minimum numbers

        List<Integer> numbers = Arrays.asList(
                10, 20, 5, 40, 30
        );

       // Map<Character,List<Integer>> map=new TreeMap<>();

       OptionalInt res=numbers.stream()
                //.max(Comparator.comparingInt(Integer::intValue));
                       // .min(Comparator.comparingInt(Integer::intValue));
                               .mapToInt(Integer::intValue)
                                       .max();

       System.out.println(res.getAsInt());

    }
}
