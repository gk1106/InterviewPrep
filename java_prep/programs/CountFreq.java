package java_prep.programs;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFreq
{
    public static void main(String[] args) {

        String input="wellcome to the java world";

        Map<String,Long> result= Arrays.stream(input.split(" "))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(

                        i->i,
                        Collectors.counting()
                ));

        System.out.println(result);

    }
}
