package java_prep.streamApiPrograms;

import java.util.*;

public class CommonElement {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 20, 30, 40);
        List<Integer> list2 = Arrays.asList(30, 40, 50, 60);

        List<Integer> common=list1.stream()
                .filter(list2::contains)
                .distinct()
                .toList();

        System.out.println(common);
    }


}
