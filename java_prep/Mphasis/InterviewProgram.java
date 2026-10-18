package java_prep.Mphasis;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewProgram {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(7,0,5,6,3,5,0,1,1,1,3,0,6,9,3,6);

//        Map<Integer,Long> result=list.stream()
//                .sorted()
//                .collect(Collectors.groupingBy(
//                       n->n,
//                        TreeMap::new,
//                        Collectors.counting()
//
//                ));
//
////        Map.Entry<Integer,Long> finalResult=result.entrySet().stream()
////                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
////                        .findFirst()
////                                .orElse(null);
//
//        Map.Entry<Integer,Long> finalResult = result.entrySet().stream()
//                .sorted(Map.Entry.<Integer, Long>comparingByValue(Comparator.reverseOrder())
//                        .thenComparing(Map.Entry.comparingByKey(Comparator.reverseOrder())))
//                .findFirst()
//                .orElse(null);
//
//
//        System.out.println(finalResult);

        // 1. Group by number and count occurrences
        Map<Integer, Long> countMap = list.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        // 2. Find what the highest frequency count actually is (which is 3)
        long maxCount = countMap.values().stream()
                .max(Long::compare)
                .orElse(0L);

        // 3. Collect all numbers and counts that match that max count
        List<Map.Entry<Integer, Long>> finalResult = countMap.entrySet().stream()
                .filter(entry -> entry.getValue() == maxCount)
                .toList();
    System.out.println(maxCount);
        // Print the result
        finalResult.forEach(entry ->
                System.out.println("Value: " + entry.getKey() + ", Count: " + entry.getValue())
        );


    }
}
