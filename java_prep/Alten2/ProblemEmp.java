package java_prep.Alten2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProblemEmp {
    public static void main(String[] args) {


        List<Employee> empList= Arrays.asList(
                new Employee("Arun", "IT", 60000),
                new Employee("Priya", "IT", 80000),
                new Employee("Kumar", "HR", 50000),
                new Employee("Meena", "HR", 70000),
                new Employee("Rahul", "HR", 70000),
                new Employee("Ravi", "IT", 80000),
                new Employee("Kamal", "finance", 90000),
                new Employee("Rajini", "finance", 90000)
        );


        Map<String,List<Employee>> result=empList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list->{

                                    int maxSalary=list.stream().mapToInt(Employee::getSalary).max().orElse(0);

                                    return list.stream()
                                            .filter(emp->emp.getSalary() == maxSalary)
                                            .toList();


                                }



                        )

                ));


        System.out.println(result);




    }
}
