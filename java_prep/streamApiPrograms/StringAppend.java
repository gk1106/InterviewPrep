package java_prep.streamApiPrograms;

import java.util.*;
import java.util.stream.Collectors;

public class StringAppend {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Java", "Spring", "MongoDB"
        );
       // StringBuilder sb= new StringBuilder();
//method -1
//        for(int i=0;i<names.size();i++){
//            if(i>0){
//                sb.append(",");
//            }
//          sb.append(names.get(i));
//
//        }
//method -2
      //  String result=String.join(",",names);
//method -3

        String result=names.stream().collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
