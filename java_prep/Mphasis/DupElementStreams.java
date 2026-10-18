package java_prep.Mphasis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class DupElementStreams {
    public static void main(String[] args) {


        String name="programmming";



        Map<Character,Long> map=name.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(
                        n->n,
                        TreeMap::new,
                        Collectors.counting()


                ));



        List<Map.Entry<Character,Long>> result=map.entrySet().stream()
                .filter(n->n.getValue() >1)
                .toList();
        System.out.println(result);


    }

}
