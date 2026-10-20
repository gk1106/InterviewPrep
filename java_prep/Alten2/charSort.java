package java_prep.Alten2;

public class charSort {
    public static void main(String[] args) {
        String word="aaabbbbcccddeeeef";


        if(word.length()==0 && word.isEmpty()){
            System.out.println("Empty String");
        }

        char first=word.charAt(0);

        int count=0;

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)== first){
                count++;
            }else{
                sb.append(first).append(count);
                first=word.charAt(i);
                count=1;

            }


        }
        sb.append(first).append(count);

        System.out.println(sb);



    }
}
