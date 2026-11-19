package java_prep.InterviewPrepare;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8
        );
        Map<String,List<Integer>> res=new HashMap<>();



       res=numbers.stream()
                .collect(Collectors.groupingBy(

                        n->n % 2==0 ?"even":"odd",
                        Collectors.toList()

                ));

       System.out.println(res);


    }
}
