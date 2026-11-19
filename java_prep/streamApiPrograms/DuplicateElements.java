package java_prep.streamApiPrograms;

import java.util.*;

public class DuplicateElements {
    public static void main(String[] args) {


        //1. Find duplicate elements in a list

        List<Integer> numbers = Arrays.asList(
                10, 20, 30, 20, 40, 10, 50
        );

        Set<Integer> set=new HashSet<>();

        List<Integer> res=numbers.stream()
                .filter(n->!set.add(n))
                .toList();

        System.out.println(res);

    }
}
