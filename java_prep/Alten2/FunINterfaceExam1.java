package java_prep.Alten2;

import java.util.function.BiPredicate;

public class FunINterfaceExam1 {
    public static void main(String[] args) {


        BiPredicate<Integer,Integer>  isElegibal=(a,b)->a.equals(b);

        System.out.println(isElegibal.test(1,2));
        System.out.println(isElegibal.test(2,2));


    }
}
