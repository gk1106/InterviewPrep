package java_prep.StreamProgramPrac;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Programq {
    public static void main(String[] args) {
        //Lamda expression
//        List<String> names=List.of("george","kamal","rajini","thamos");
//
//                     List<String> result=    names.stream().filter(n->n.startsWith("a"))
//                             .toList();
//
//                     System.out.println(result);
        //even numbers
                   //List<Integer> result= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

//                  Map<String,List<Integer>> val= result.stream()
//                          .collect(Collectors.groupingBy(
//                                  n->n%2==0?"Even":"odd"
//
//                          ));

         //maximun value
//            int max=result.stream()
//                            .max(Integer::compare)
//                                    .orElse(0);
        //listofString to uppercase
//
        //name and its length
//        List<String> names=List.of("george","kamal","rajini","thamos");
//
//        Map<Integer,List<String>>group=names.stream()
//                .collect(Collectors.groupingBy(
//                        String::length
//                ));
//
//
//
//        System.out.println(group);

//        List<Integer> result= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//
//
//       Integer sum= result.stream()
//                .reduce(0,Integer::sum);
//
//       System.out.println(sum);

        List<String> words = Arrays.asList("Hello", "World", "Hello", "World");

        Map<String,Long> CountWords=words.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()


                ));

        System.out.println(CountWords);




    }
}
