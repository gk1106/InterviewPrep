package java_prep.programs;

public class Foccur {
    public static void main(String[] args) {
//firstOccurance and last  program

        String name="ganeshkumar";

        char ch='a';
        int index=-1;

        for(int j=0;j<name.length();j++){

            if(name.charAt(j)==ch){

                index=j;


                //System.out.println("index"+j);
                //break;
            }



        }

System.out.println(index);
    }
}
