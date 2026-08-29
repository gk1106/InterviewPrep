package java_prep.programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RevWord8 {
    public static void main(String[] args) {


        String input="wellcome to the java world";

       String result= Arrays.stream(input.split(" "))
                       .map( n->new StringBuilder(n).reverse().toString())
                               .collect(Collectors.joining(" "));
        System.out.println(result);
    }

}
