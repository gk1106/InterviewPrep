package java_prep.Easy;

public class vowels {

    public static void main(String[] args) {

        String word="wellsome";
        int count=0;


        for(char c:word.toCharArray()){

            if("aeiou".indexOf(c) != -1){


                count++;
            }

        }
        System.out.println(count);


    }
}
