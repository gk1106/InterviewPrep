package java_prep.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class Lamda {
    public static void main(String[] args) {


        List<String> names =
                Arrays.asList("John", "Alex", "Bob", "Andrew", "David");


                  names.stream()
                          .filter(n->n.startsWith("A"))
                          .forEach(System.out::println);




        }



    }

