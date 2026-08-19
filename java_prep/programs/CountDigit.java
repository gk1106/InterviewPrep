package java_prep.programs;

public class CountDigit {
    public static void main(String[] args) {


        String name="1name is the5 is the87 uydgfweugwe89yed98w23e287r23";

        String num=name.replaceAll("[^0-9]","");

        System.out.println(num);

        int count=0;
        for(int i=0;i<num.length();i++){

          count++;

        }

      System.out.println(count);

    }
}
