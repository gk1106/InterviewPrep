package java_prep.LeetcodePrac;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumOcc {
    //Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, otherwise return false.
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1,3, 3};

        System.out.println(uniqueOccurrences(arr));

    }

    public static boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        HashSet<Integer> set = new HashSet<>();

        for(Integer i : arr){

            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(Integer key:map.values()){

            if(set.contains(key)){
                return false;

            }

           set.add(key);
        }

        return true;

    }
}
