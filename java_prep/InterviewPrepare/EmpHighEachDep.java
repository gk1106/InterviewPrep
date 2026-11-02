package java_prep.InterviewPrepare;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpHighEachDep {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "Alice", "IT", 95000, 29),
                new Employee(2, "Bob", "IT", 120000, 34),
                new Employee(3, "Charlie", "HR", 70000, 27),
                new Employee(4, "David", "HR", 85000, 31)
        );


        Map<String,Employee> result=employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::department,(


                                Collectors.collectingAndThen(

                                        Collectors.maxBy(Comparator.comparingDouble(Employee::salary)),
                                        Optional::get
                                )
                        )

                ));

        System.out.println(result);
    }

}
