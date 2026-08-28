package java_prep.programsInter;

import java.util.Arrays;

public class TwoPointerJava {
    public static void main(String[] args) {
        int[] nums={3,4,5,9,-1,-6,9,-3,-4,-8};

        int[] posNum=new int[nums.length];
        int[] negNumOdd=new int[nums.length];

        int[] negNumEven=new int[nums.length];

        int j=0;


        for(int i=0;i<nums.length;i++){




                if(nums[i]   >=0){

                    posNum[i]=nums[i];

                    j++;


                }



        }

        System.out.println(Arrays.toString(posNum));
    }
}
