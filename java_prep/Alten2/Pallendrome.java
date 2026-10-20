package java_prep.Alten2;

public class Pallendrome {
    public static void main(String[] args) {


        String word="malayalam";


        StringBuilder sb=new StringBuilder();


        for(int i=word.length()-1;i>=0;i--){

            sb.append(word.charAt(i));
        }

      if(sb.toString().equals(word)){

          System.out.println("pallendrome");
      }else
          System.out.println("not pallendrome"+"-----"+sb.toString() +"-----"+ word);


    }
}
