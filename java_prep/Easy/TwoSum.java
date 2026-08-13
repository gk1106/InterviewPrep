package java_prep.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        int nums[] = {11,15,2,7,};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));


    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int complement=target-nums[i];

            if(map.containsKey(complement)){


                return new int[] {map.get(complement),i};

            }
            map.put(nums[i],i);



        }

        return new int[] {};

    }
}
