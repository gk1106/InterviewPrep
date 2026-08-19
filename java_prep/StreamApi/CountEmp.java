package java_prep.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEmp {
    public static void main(String[] args) {
        List<Employees> employees = Arrays.asList(
                new Employees("Arun", "IT"),
                new Employees("Bob", "HR"),
                new Employees("Anu", "IT"),
                new Employees("David", "Finance"),
                new Employees("Alex", "HR")
        );


       // Map<String,List<Employees>> result=employees.stream()

        Map<String,Long> result=employees.stream()

                .collect(Collectors.groupingBy(Employees::getDepartment,Collectors.counting()));

    System.out.println(result);
    }
}
