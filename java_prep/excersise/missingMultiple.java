package java_prep.excersise;

import java.util.HashSet;
import java.util.Set;

public class missingMultiple {
    public static void main(String[] args) {

        int[] nums={8,2,3,4,6};
        int k=2;

        System.out.println(multiple(nums,k));
    }

    public static Integer multiple(int[] nums,int k){
//        for(int i=1; ;i++){
//           int  result=k*i;
//            boolean found=false;
//
//            for(int num:nums){
//
//               if(num==result){
//
//                   found=true;
//                   break;
//               }
//            }
//            if(!found){
//                return result;
//            }
//        }


        Set<Integer> set=new HashSet<>();

        for(int num:nums){

            set.add(num);
        }

        int mul=k;

        while(set.contains(mul)){

            mul += k;

        }

        return mul;
    }
}
