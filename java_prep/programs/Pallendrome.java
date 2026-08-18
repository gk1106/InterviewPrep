package java_prep.programs;

public class Pallendrome {
    public static void main(String[] args) {

        String s="A man, a plan, a canal: Panama";
            String val=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();

            StringBuilder sb=new StringBuilder();

            sb.append(val);

            if(sb.toString().equals(val)){

                System.out.println("True"+sb.toString());
            }else{
                System.out.println("False"+sb.toString());

            }


    }
}
