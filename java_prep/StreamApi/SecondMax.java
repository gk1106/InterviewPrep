package java_prep.StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondMax {
    public static void main(String[] args) {


        List<Integer> num= Arrays.asList(21,43,5,4,65,1,2,90,432,34,111);

        Optional<Integer> secondMax=num.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        secondMax.ifPresent(System.out::println);


    }
}
