package java_prep.LeetcodePrac;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DifTwoArray {
    public static void main(String[] args) {

        int[] num1={1,2,3,4};
        int[] num2={1,6,9,4};

        System.out.println(numDif(num1,num2));

    }

    public static List<List<Integer>> numDif(int[] nums1,int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();

        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();

        List<List<Integer>> list=new ArrayList<>();


        for (int j : nums1) {

            set1.add(j);
        }

        for (int j : nums2) {
            set2.add(j);
        }

        for(Integer val1:set1){

            if(!set2.contains(val1)){
                list1.add(val1);

            }
        }

        for(Integer val2:set2){
            if(!set1.contains(val2)){

                list2.add(val2);
            }
        }

        list.add(list1);
        list.add(list2);




        return list;





    }
}
