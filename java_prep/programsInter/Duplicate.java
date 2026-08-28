package java_prep.programsInter;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 2, 4, 5, 1};

        Set<Integer> set=new HashSet<>();
        Set<Integer> duplicate=new HashSet<>();

        for(int num:arr){

            if(!set.add(num)){

                duplicate.add(num);
            }
        }

        System.out.println(set);
    }
}
