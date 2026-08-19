package java_prep.programs;

public class vowells {
    public static void main(String[] args) {

        String name="wellsome";
        Integer count=0;



        for(char a:name.toCharArray()){


            if("aeiou".indexOf(a) != -1){


                count++;
            }

        }

        System.out.println(count);

    }
}
