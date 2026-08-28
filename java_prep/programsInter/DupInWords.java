package java_prep.programsInter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DupInWords {
    public static void main(String[] args) {
        List<String> names =
                Arrays.asList(
                        "ganesh",
                        "vimal",
                        "ajay",
                        "ganesh",
                        "vimal",
                        "ganesh"
                );


        Set<String> result=names.stream()
                .filter(n-> Collections.frequency(names,n)>1)
                .collect(Collectors.toSet());

        System.out.println(result);
    }
}
