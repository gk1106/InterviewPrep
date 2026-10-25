package java_prep.Alten2;

import java.util.*;
import java.util.stream.Collectors;

public class SecondHighSal {
    public static void main(String[] args) {

        List<Employee> empList= Arrays.asList(
                new Employee("Arun", "IT", 60000),
                new Employee("Priya", "IT", 80000),
                new Employee("Kumar", "HR", 50000),
                new Employee("Meena", "HR", 70000),
                new Employee("Ravi", "IT", 80000)
        );


//second hihest salary

  Integer  result=empList.stream()
                        .map(Employee::getSalary)
                                .distinct()
                                        .sorted(Comparator.reverseOrder())
                                                .skip(1)
                                                        .findFirst()
                                                                .orElse(0);




        System.out.println(result);
    }
}
