package java_prep.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LargestNum {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        Optional<Integer> result=list.stream()
                .max(Integer::compareTo);

        result.ifPresent(System.out::println);
    }
}
