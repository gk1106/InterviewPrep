package java_prep.Easy;

public class Duplicate {

    public static void main(String[] args) {

        String words="wellcome";

        StringBuilder sb=new StringBuilder();



  for(char word:words.toCharArray() ){


          if(sb.indexOf(String.valueOf(word)) == -1) {

              sb.append(word);

          }




      }
        System.out.println(sb.toString());

  }





    }

