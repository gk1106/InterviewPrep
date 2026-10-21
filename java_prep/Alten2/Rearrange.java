package java_prep.Alten2;

import java.util.HashMap;
import java.util.Map;

public class Rearrange {
    public static void main(String[] args) {




//        String[] words=name.split(" ");
//
//        StringBuilder s=new StringBuilder();
//
//        Map<Integer,String> map=new HashMap<>();
//
//        for(String word:words){
//
//            String key=word.replaceAll("[^A-Za-z]","");
//
//            Integer value=Integer.parseInt(word.replaceAll("[^0-9]",""));
//            map.put(value,key);
//
//        }
//
//        for(int i=0;i<words.length;i++){
//
//           s.append( map.get(i)).append(" ");
//        }

        //optimized version

        String name="name1 i2s gan3esh m0y";

        String[] words=name.split(" ");
        String[] Result=new String[words.length];

        for(String word:words){

            String key =word.replaceAll("[^A-Za-z]","");
            int value=Integer.parseInt(word.replaceAll("[^0-9]",""));


              Result[value] =key;

        }

        StringBuilder sb=new StringBuilder();

        for(String word:Result){

            sb.append(word).append(" ");

        }

        System.out.println(sb.toString().trim());




    }
}
