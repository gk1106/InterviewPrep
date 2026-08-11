package java_prep.Easy;

public class consonant {
    public static void main(String[] args) {

        String word="malai";
        int count=0;


        for(char w:word.toCharArray()){

            if("aeiou".indexOf(w) == -1){
                count++;
            }


        }
        System.out.println(count);

    }
}
