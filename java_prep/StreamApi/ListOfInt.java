package java_prep.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListOfInt {
    public static void main(String[] args) {

        List<List<Integer>> list= Arrays.asList(

                Arrays.asList(1,2,3,4,5,6,7,6,5,4,32,1,54), Arrays.asList(11,22,33,44,55,66,5,4,3,2,1,6)
        );

        //using flatMap

        List<Integer>  result= list.stream()
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();

        //

System.out.println(result);
    }
}
