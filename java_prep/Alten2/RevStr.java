package java_prep.Alten2;

public class RevStr {
    public static void main(String[] args) {


        String str="Alten";




        StringBuilder sb=new StringBuilder();

        for(int i=str.length()-1;i>=0;i--){

            sb.append(str.charAt(i));


        }

        System.out.println(sb);
    }
}
