package java_prep.StreamApi;



public class NonrepatChar {

    public static void main(String[] args) {
        String name="swiwssj";


//        Character result=name.chars()
//                .mapToObj(n->(char) n)
//                .collect(Collectors.groupingBy(
//                        Function.identity(),
//                        LinkedHashMap::new,
//                        Collectors.counting()
//
//
//                ))
//                .entrySet()
//                .stream()
//                .filter(n->n.getValue() ==1)
//                .map(Map.Entry::getKey)
//                .findFirst()
//                .orElse(null);


        Character result=name.chars()
                        .mapToObj(n->(char)n)
                                .filter(n->name.indexOf(n) == name.lastIndexOf(n))
                                        .findFirst()
                                                .orElse(null);


        System.out.println(result); // w
    }


}
