package java_prep.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StringRegres {
    public static void main(String[] args) {


        String word=" mond2ay To0day sunnyday3 i1s  ";

        String[] words=word.split(" ");
        Map<Integer,String> map=new HashMap<>();
        String LastWord="";

        for(String w:words){

            String number=w.replaceAll("[^0-9]","");

            System.out.println("number "+number);
            if(!number.isEmpty()){

                int index=Integer.parseInt(number);
                String text=w.replaceAll("[0-9]","");

                map.put(index,text);


            }else{

                LastWord=w;
            }

        }
        System.out.println("before"+map);


        StringBuilder sb=new StringBuilder();

//        for(int i=0;i<map.size();i++){
//
//             sb.append(map.get(i)).append(" ");
//        }
        sb.append(LastWord);
        System.out.println(sb);


    }
}
