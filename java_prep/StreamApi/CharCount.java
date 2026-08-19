package java_prep.StreamApi;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCount {
    public static void main(String[] args) {

        String name = "ganeshkumar";


        Map<Character,Long> result=name.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(), TreeMap::new,
                        Collectors.counting()


                ));
        System.out.println(result);


    }
}
/*"ganeshkumkar"
       ↓
  chars()
       ↓
IntStream
       ↓
mapToObj()
       ↓
Stream<Character>
       ↓
groupingBy()
       ↓
┌────────────────────────────┐
│ Function.identity()        │ → character = key
│ TreeMap::new               │ → sorted keys
│ counting()                 │ → count values
└────────────────────────────┘
       ↓
{a=2, e=1, g=1, h=1, k=2, m=1, n=1, r=1, s=1, u=1}
*/
