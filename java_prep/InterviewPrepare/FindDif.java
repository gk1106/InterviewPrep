package java_prep.InterviewPrepare;

import javax.swing.*;

public class FindDif {
    public static void main(String[] args) {

        String s="ganesh";
        String t="ganeshv";


        //show the diff

        int sum1=0;
        int sum2=0;

        for(char c:s.toCharArray()){

            sum1 +=c;
        }

        for(char c:t.toCharArray()){
            sum2 +=c;
        }

        System.out.println((char)(sum2 - sum1));


    }
}
