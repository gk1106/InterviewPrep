package java_prep.excersise;

public class StringMerge {
    public static void main(String[] args) {
        //1768. Merge Strings Alternately

        String word1 = "abc";
        String word2 = "abc";
        System.out.println(merge(word1, word2));
    }

    public static String merge(String word1, String word2) {

        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        StringBuffer sb = new StringBuffer();

        for(int i=0;i<Math.max(w1.length,w2.length);i++){

            if(i<w1.length){

                sb.append(w1[i]);
            }

            if(i<w2.length){
                sb.append(w2[i]);
            }



        }




        return sb.toString();
    }
}
