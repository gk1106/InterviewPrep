package java_prep.InterviewPrepare;

import java.util.*;

public class DuplicateInStream {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                10, 20, 30, 20, 40, 10, 50
        );

        Set<Integer> set =new HashSet<>(numbers);

        List<Integer> list =set.stream()
                .filter(n-> !set.add(n))
                .sorted()
                .toList();

        System.out.println(list);






    }
}
