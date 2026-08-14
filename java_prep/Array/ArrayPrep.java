package java_prep.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayPrep {
    public static void main(String[] args) {


        ArrayList list=new ArrayList();

        LinkedList linkedList=new LinkedList();

        StringBuilder sb=new StringBuilder();


        list.add("hello");
        list.add("world");
        list.add("java");


        linkedList.add("four");
        linkedList.add("five");
        linkedList.add(6);
        linkedList.add("seven");
        linkedList.add("eight");

        sb.append("well come here");

        System.out.println(sb);

        System.out.println(list);

       System.out.println(Arrays.toString(list.toArray()));



    }
}
