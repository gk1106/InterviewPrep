package java_prep.InterviewPrepare;

import java.util.Arrays;
import java.util.HashSet;

public class FindWord {
    public static void main(String[] args) {
        String s = "Java Python SQL";
        String t = "Java SQL";



        String[] s1=s.split(" ");
        String[] s2=t.split(" ");


        HashSet<String> hs = new HashSet<String>(Arrays.asList(s2));


          for(String str:s1){

              if(!hs.contains(str)){

                  System.out.println(str);
              }
          }


    }
}
