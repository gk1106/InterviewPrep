package java_prep.Alten2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Twosum {
    public static void main(String[] args) {


        int[] num ={2,7,11,15};
        int target =9;

         int[] arr=getsum(num,target);

         System.out.println(Arrays.toString(arr));




    }


    public  static  int[] getsum(int[] num,int target){


        Map<Integer,Integer> map =new HashMap<>();


        for(int i=0;i<num.length;i++){

            int complement =target -num[i];

            if(map.containsKey(complement)){


                return new int[] {map.get(complement),i};
            }


            map.put(num[i],i);

        }

        return new int[] {};
    }


}
