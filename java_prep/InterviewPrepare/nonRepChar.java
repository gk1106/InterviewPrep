package java_prep.InterviewPrepare;

public class nonRepChar {
    public static void main(String[] args) {

        String str = "aabbcdeef";

        Character result=str.chars()
                .mapToObj(c->(char)c)
                .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
                //.skip(1)   --to find second non rep char
                .findFirst()
                .orElse(null);


        System.out.println(result);

    }
}
