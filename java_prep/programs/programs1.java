package java_prep.programs;

public class programs1 {
    public static void main(String[] args) {
        String name="Ganeshkumar";
        char[] val=name.toCharArray();

       for(int i=0;i<val.length;i++){

           if(i % 2 ==0){

               System.out.println(val[i]);
           }

       }
    }
}
