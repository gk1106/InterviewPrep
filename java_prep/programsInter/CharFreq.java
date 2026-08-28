package java_prep.programsInter;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CharFreq {
    public static void main(String[] args) {
        String names="ganeshkumar";

//        Map<Character,Long> values=name.chars()
//                .mapToObj(c->(char)c)
//                .collect(Collectors.groupingBy(
//                        c->c
//                        , TreeMap::new,
//                        Collectors.counting()
//
//
//                ));

        Map<Character,Long> values=new TreeMap<>();

        for(char name:names.toCharArray()){

            if(!values.containsKey(name)){

                values.put(name,values.getOrDefault(name,0L)+1);
            }
        }

        System.out.println(values);
    }
}
