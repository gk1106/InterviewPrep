package java_prep.programsInter;

public class CountVowells {
    public static void main(String[] args) {

        String name="Ganeshkumar";

         Integer count=0;

         for(int i=0;i<name.length();i++){

             if("aeiou".indexOf(name.charAt(i)) != -1){

                 count ++;
             }

         }

         System.out.println(count);


    }
}
