package java_prep.Alten2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmpSortByIt {
    public static void main(String[] args) {
        //find all emp in It dep sal > 50k in sorted way
        List<Employee> empList= Arrays.asList(


                new Employee("Priya", "IT", 80000),
                new Employee("Arun", "IT", 60000),
                new Employee("Kumar", "HR", 50000),
                new Employee("Meena", "HR", 70000),
                new Employee("Ravi", "IT", 10000)
        );

        List<String> EmpName=empList.stream()
                .filter(emp-> emp.getDepartment().equals("IT") && emp.getSalary() >= 50000)
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(EmpName);

    }
}
