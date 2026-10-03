package java_prep.Sep24;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class prog1 {
    public static void main(String[] args) {

        List<Integer> result= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Map<String,List<Integer>>  grp=result.stream()
                .collect(Collectors.groupingBy(

                        n->n%2==0 ?"even":"odd"

                ));
        System.out.println(grp);



    }
}
