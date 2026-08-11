package java_prep.Easy;

import java.util.HashMap;

public class CountWord {
    public static void main(String[] args) {

        String[] words={"ball","bat","cow","bat","ball","goat"};


        HashMap<String,Integer> values=new HashMap<>();

        for(String word:words){

             values.put(word,values.getOrDefault(word,0)+1);


        }


  System.out.println(values);





    }
}
