package java_prep.excersise;

import java.util.Arrays;

//kadanes algorithm
public class SubArray {

    public static void main(String[] args) {



       int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

      // System.out.println(Arrays.toString(new int[]{sumSubarray(nums)}));
       System.out.println(sumSubarray(nums));
    }

    public static  int sumSubarray(int[] nums){
        int maxEnding=nums[0];

        int res=nums[0];

        for(int i=1;i<nums.length;i++){
            //kadane's algorithm-+ every i extend by ad element or throw it away and start new subarray
            maxEnding=Math.max(maxEnding+nums[i],i);

            res=Math.max(res,maxEnding);


        }
        return res;


    }


}
