package java_prep.Alten2;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 2, 1, 7, 3, 5, 9};

        int[] result= Arrays.stream(arr)
                .sorted()
                .distinct()
                .toArray();

        System.out.println(Arrays.toString(result));

    }
}
