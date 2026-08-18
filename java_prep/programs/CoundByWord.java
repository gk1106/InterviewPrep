package java_prep.programs;

import java.util.Map;
import java.util.TreeMap;

public class CoundByWord {
    public static void main(String[] args) {



        String name="Ganeshkumar";

        char[] nameArr=name.toLowerCase().toCharArray();


        Map<Character,Integer> map=new TreeMap<>();

        for(int i=0;i<name.length();i++){

            map.put(nameArr[i],map.getOrDefault(nameArr[i],0)+1);



        }

        System.out.println(map);

    }
}
