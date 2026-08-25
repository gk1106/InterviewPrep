package java_prep.excersise;

import java.util.HashMap;

public class uniqueChar {
    public static void main(String[] args) {
        //First Unique Character in a String

        String s="malayalam";
        System.out.println(firstUniqChar(s));

    }

    public static int firstUniqChar(String s) {


       // char[] val=s.toLowerCase().toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();

//        for(int i=0;i<s.length();i++){
//                map.put(val[i],map.getOrDefault(val[i],0)+1);
//        }

        for(char c:s.toCharArray()){

            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int i=0;i<s.length();i++){

            if(map.get(s.charAt(i)) ==1){
                return i;
            }
        }
        return -1;

    }
}
