package java_prep.programsInter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class NonRC {
    public static void main(String[] args) {
        String name="SWISS";

        Map<Character,Long> values=new LinkedHashMap<>();

        for(char n:name.toCharArray()) {


            values.put(n, values.getOrDefault(n, 0L) + 1);

        }


            for(Map.Entry<Character,Long> e:values.entrySet()){


                if(e.getValue()==1){

                    System.out.println(e.getKey());
                    break;
                }
            }

    }
}
