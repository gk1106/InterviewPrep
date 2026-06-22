package java_prep.excersise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//two-sum-ii-input-array-is-sorted  =return new int[] {values.get(complement+1),i+1};
public class TwoSum {
    public static void main(String[] args) {
       int[] nums= {-1,0};
       int target = -1;


       System.out.println(Arrays.toString(twoSum(nums, target)));

    }



    public static int[] twoSum(int[] nums,int target)
    {

        Map<Integer, Integer> values=new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int complement=target - nums[i];

            if(values.containsKey(complement)){


                return new int[] {values.get(complement),i};
            }


            values.put(nums[i],i);



        }
        throw new  IllegalStateException("No values found");

    }


    
}
