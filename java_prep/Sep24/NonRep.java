package java_prep.Sep24;

import java.util.Optional;

public class NonRep {
    public static void main(String[] args) {

        String word="malayalam";


        Character res=word.chars()
                .mapToObj(a->(char)a)
                .filter(a->word.indexOf(a) == word.lastIndexOf(a))
                .findFirst()
                .orElse(null);

        System.out.println(res);

    }
}
