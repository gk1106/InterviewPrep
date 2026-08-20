package java_prep.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistrubuteArray {
    public static void main(String[] args) {
        int[] nums={2,1,3};
        resultArray(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static  int[] resultArray(int[] nums) {

        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for(int i=2;i<nums.length;i++){

            if(arr1.getLast()> arr2.getLast()){

                arr1.add(nums[i]);
            }else{

                arr2.add(nums[i]);
            }
        }

        arr1.addAll(arr2);
        int[] result=new int[arr1.size()];
        for(int i=0;i<arr1.size();i++){

            result[i]=arr1.get(i);

        }

        return result;



    }


}
