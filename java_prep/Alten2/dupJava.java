package java_prep.Alten2;

import java.util.*;

public class dupJava {
    public static void main(String[] args) {
        int[] number={1,2,3,2,1,4,5,6};

        Set<Integer> set=new HashSet<>();

        List<Integer> list= Arrays.stream(number)
                .filter(n->!set.add(n))
        .distinct()
                .boxed()
        .toList();

        System.out.println(list);
    }
}
