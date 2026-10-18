package java_prep.Mphasis;


import java.util.*;
import java.util.stream.Collectors;

public class SortEmpBySal {
    public static void main(String[] args) {
        List<Employees> emp= Arrays.asList(
                new Employees("Alice", "IT", "85000"),
                new Employees("Bob", "IT", "95000"),
                new Employees("Charlie", "HR", "60000"),
                new Employees("David", "HR", "75000"),
                new Employees("Eve", "Finance", "110000")
        );



//       Optional<Employees> result=emp.stream()
//                .sorted(Comparator.comparing(Employees::getSalary).reversed())
//        .skip(1)
//                .findFirst();

//find highest salry dif by department
        Map<String,Optional<Employees>> result=emp.stream()
                        .collect(Collectors.groupingBy(
                                Employees::getDepartment,
                                Collectors.maxBy(Comparator.comparingInt(e-> Integer.parseInt(e.getSalary())))
                        ));

        System.out.println(result);


//HashMap<Integer,String>map=




    }
}
