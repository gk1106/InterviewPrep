package java_prep.programs;

import java.util.Map;
import java.util.TreeMap;

public class CountByWords {
    public static void main(String[] args) {


        String[] values={"ball","bat","ball","gun","pipe"};
        Integer num=values.length;

        //System.out.println(num);

        Map<String,Integer> map=new TreeMap<>();

        for(int i=0;i<values.length;i++){

            map.put(values[i],map.getOrDefault(values[i],0)+1);


        }

        System.out.println("map:"+map);

    }
}
