package java_prep.programs;

public class ReduceAlgo {
    public static void main(String[] args) {

        String str="aaaabbccccddddeeefgggg";

        char[] arr=str.toCharArray();


        int count=1;

        char current=arr[0];

        StringBuffer sb=new StringBuffer();
        for(int i=0;i<arr.length;i++){

            if(arr[i]==current){

               count++;

            }else{
                sb.append(current).append(count);

               current=arr[i];
               count=1;

            }

        }

        System.out.println(sb.toString());

    }
}
