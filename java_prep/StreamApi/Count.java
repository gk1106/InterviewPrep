package java_prep.StreamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Count {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("ganesh","vimal","ajay","ganesh","vimal","ajay","ganesh","nirmal","sachin");

        Set<String> seen=new HashSet<>();


        List<String> result=names.stream()
                .filter(n->!seen.add(n))
                .distinct()
                .collect(Collectors.toList());
//        StringBuilder Sb=new StringBuilder();
//
//
//
//
//        String word="wellcome to java world";
//
//        char[] res=word.toCharArray();
//
//
//
//        System.out.println(Arrays.toString(res));






      System.out.println(result);
    }
}
