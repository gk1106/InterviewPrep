package java_prep.StreamApi;

import java.util.*;
import java.util.stream.Collectors;

public class EmpSal {
    public static void main(String[] args) {
        List<Emp> employees = Arrays.asList(
                new Emp("Arun", "IT", 60000),
                new Emp("Bob", "HR", 50000),
                new Emp("Anu", "IT", 70000),
                new Emp("David", "Finance", 80000),
                new Emp("Alex", "HR", 55000)
        );

        //totalSalaryof each department

        Map<String, Optional<Emp>> result=employees.stream()
                .collect(Collectors.groupingBy(
                        Emp::getDepartment,
                       Collectors.maxBy(
                               Comparator.comparingDouble(Emp::getSalary)
                       )



                ));
        System.out.println(result.toString());

    }
}
/*Employees
    ↓
groupingBy(Employee::getDepartment)
    ↓
 ┌─────────────┐
 │ IT          │ → Arun, Anu
 │ HR          │ → Bob, Alex
 │ Finance     │ → David
 └─────────────┘
    ↓
maxBy(salary)
    ↓
IT      → Optional[Anu]
HR      → Optional[Alex]
Finance → Optional[David]
*/