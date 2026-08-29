package java_prep.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Hcl1 {
    public static void main(String[] args) {
        //List<List<Integer>> sort the list in single list

        List<List<Integer>>  numbers= Arrays.asList(Arrays.asList(22,1,3,43,56,21,2,8,8,9),
                Arrays.asList(9,8,7,6,5,4,3,90,76,34,21));

        List<Integer> result=numbers.stream()
                .flatMap(n->n.stream())
                .distinct()
               .sorted()
                .toList();

        System.out.println(result);

    }
}
