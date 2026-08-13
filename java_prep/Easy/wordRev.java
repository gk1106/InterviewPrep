package java_prep.Easy;

import java.util.Arrays;

public class wordRev {
    public static void main(String[] args) {
 String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }


        public static String reverseWords(String s) {

            String[] words=s.trim().split("\\s+");
           // System.out.println("beforeeee"+ Arrays.toString(words));
            StringBuilder sb=new StringBuilder();

            for(int i=words.length-1;i>=0;i--){

                sb.append(words[i]+" ");
                //System.out.print(words[i]);




            }
            return sb.toString().trim();


        }

}
