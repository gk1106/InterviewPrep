package java_prep.Alten2;

import java.util.ArrayList;
import java.util.List;

public class ExceptionHandleConcur {
    public static void main(String[] args) {


        List<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for(int i=0;i<list.size();i++){

            list.add(list.get(i));
            list.remove(1);
        }

        System.out.println(list);
    }
}
