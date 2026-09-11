package java_prep.GkPrepare.FunctionalINterface;

import java_prep.GkPrepare.Validation;

import java.util.function.BiPredicate;

public class Val {

    public static void main(String[] args) {


//        BiPredicate<String,Integer> result=(Country,age)->{
//
//            if(Country.equalsIgnoreCase("India") && age >= 18){
//
//               return  true;
//            }
//
//            return false;
//        };

        BiPredicate<String,Integer> result=(Country,age)->Country.equalsIgnoreCase("INDIA") && age >=18;
        System.out.println(result);


        System.out.println(result.test("india",31));
    }
}
