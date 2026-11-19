package java_prep.InterviewPrepare;

import java.util.Arrays;
import java.util.List;

public class MaxandMin {
    public static void main(String[] args) {


        List<Integer> num= Arrays.asList(30,10,20,80,90);


        int max=num.stream().max(Integer::compareTo).get();


        int min=num.stream().min(Integer::compareTo).get();


        System.out.println("max:"+max +" min:"+min);


    }
}
