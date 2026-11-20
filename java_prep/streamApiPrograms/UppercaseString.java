package java_prep.streamApiPrograms;

import java.util.Arrays;
import java.util.List;

public class UppercaseString
{
    public static void main(String[] args) {


        List<String> names = Arrays.asList(
                "java", "spring", "hibernate"
        );

        List<String> upCase=names.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(upCase);

    }
}
