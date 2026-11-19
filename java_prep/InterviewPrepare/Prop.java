package java_prep.InterviewPrepare;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Prop {
    public static void main(String[] args) {

   String name="swiss";

   Character result=name.chars()
           .mapToObj(n->(char) n)
          // .filter(n->name.indexOf(n) == name.lastIndexOf(n))

           .collect(Collectors.groupingBy(
                   Function.identity(),
                   LinkedHashMap::new,
                   Collectors.counting()

           ))
                   .entrySet().stream()
                   .filter(e->e.getValue() ==1)
           .map(Map.Entry::getKey)
           .findFirst()
           .orElse(null);




  System.out.println(result);

    }
}
