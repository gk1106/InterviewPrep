package java_prep.Sep24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DuplicateElement {

    public static void main(String[] args) {

        int[] nums={2,3,4,5,3,45,6,7,1,2,2,3};

        HashSet<Integer> set=new HashSet<>();

        HashSet<Integer> dup=new HashSet<>();

        for(int num:nums){

            if(!set.add(num)){
                dup.add(num);
            }
        }


      // return new ArrayList<>(dup);

        System.out.println(dup);

    }
}
