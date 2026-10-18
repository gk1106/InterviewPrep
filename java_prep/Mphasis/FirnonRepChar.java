package java_prep.Mphasis;

public class FirnonRepChar {
    public static void main(String[] args) {
        String name="malayalam";

        Character ch=name.chars()
                .mapToObj(c->(char)c)
                .filter(n->name.indexOf(n) == name.lastIndexOf(n))
                .findFirst().orElse(null);


        System.out.println(ch);
    }
}
