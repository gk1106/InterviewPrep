package java_prep.Alten2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostFreqElement {
    public static void main(String[] args) {
        //find most freq element in a string
        List<Integer> list= Arrays.asList(7,0,5,6,3,5,0,1,1,1,3,0,6,9,3,6);

        Map<Integer,Long> result=list.stream()
                .sorted()
                .collect(Collectors.groupingBy(
                        Integer::intValue,
                        Collectors.counting()

                ));

        System.out.println(result);

    }
}
