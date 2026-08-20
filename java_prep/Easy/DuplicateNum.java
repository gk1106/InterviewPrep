package java_prep.Easy;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNum {
    public static void main(String[] args) {
        int[] nums={1,2,3,0};

        Boolean result=containsDuplicate(nums);
        System.out.println(result);
    }
    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> map=new HashSet<>();
        for(int i=0;i<nums.length;i++){


                if(!map.contains(nums[i])){
                    map.add(nums[i]);

                }else{
                    return true;
                }
        }
        return false;
    }
}
