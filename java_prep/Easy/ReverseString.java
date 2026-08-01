package java_prep.Easy;

import static java.util.Collections.reverse;

public class ReverseString {
    public static void main(String[] args) {
        String words="Malayalaem";

        System.out.println("Reverse Words:::"+reverses(words.toLowerCase()));

        if(words.toLowerCase().equals(reverses(words.toLowerCase()))){

            System.out.println("the given words is palindrome");
        }else {
            System.out.println("the given words is not palindrome");
        }
    }

    public static String reverses(String str){
        String revWords="";
        for(int i=str.length()-1;i>=0;i--){

            revWords +=str.charAt(i);

        }






        return revWords;

    }

}
