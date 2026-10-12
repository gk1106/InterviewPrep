package java_prep.InterviewPrepare;

import java.util.HashMap;
import java.util.Map;

public class HashmapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();


        map.put("java", 10);
        map.put("Ball", 20);
        map.put("java", 30);


        System.out.println(map.size());
        System.out.println(map.get("java"));
    }
}
