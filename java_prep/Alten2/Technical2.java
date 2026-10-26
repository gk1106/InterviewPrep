package java_prep.Alten2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Technical2 {
    public static void main(String[] args) {


        Map<String,Integer> map=new LinkedHashMap<>();


        map.put("java",1);

        map.put("python",2);

        System.out.println(map.put("java",10));
        //The first line prints the old value (1), while the map contains the new value (100).

        System.out.println(map);
    }
}
