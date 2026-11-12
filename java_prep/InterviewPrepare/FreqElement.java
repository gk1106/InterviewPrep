package java_prep.InterviewPrepare;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FreqElement {
    public static void main(String[] args) {
        //Find Most Frequent Elements in duplicate
        List<Integer> list= Arrays.asList(7,0,5,6,3,5,0,1,1,1,3,0,6,9,3,6);


        Map<Integer,Long> result=list.stream()
                .sorted()
                .collect(Collectors.groupingBy(
                        n->n,
                        Collectors.counting()
                ));

        Long res=result.values().stream()
                .max(Comparator.naturalOrder())
                .orElse(null);

        List<Integer> finalres=result.entrySet().stream()
                .filter(n->n.getValue().equals(res))
                .map(Map.Entry::getKey)
                .toList();



        System.out.println(finalres);



    }
}
