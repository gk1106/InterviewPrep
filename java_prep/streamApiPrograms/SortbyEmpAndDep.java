package java_prep.streamApiPrograms;

import java_prep.InterviewPrepare.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortbyEmpAndDep {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", "IT", 75000, 28),
                new Employee(2, "Alice", "HR", 55000, 32),
                new Employee(3, "Bob", "Finance", 65000, 35),
                new Employee(4, "David", "IT", 98000, 30),
                new Employee(5, "Emma", "HR", 60000, 26),
                new Employee(6, "Charlie", "Finance", 80000, 40),
                new Employee(7, "Sophia", "IT", 95000, 29),
                new Employee(8, "James", "Sales", 50000, 25),
                new Employee(9, "Olivia", "Sales", 70000, 31),
                new Employee(10, "Michael", "IT", 85000, 38),
                new Employee(11, "William", "Finance", 72000, 33),
                new Employee(12, "Isabella", "HR", 58000, 27),
                new Employee(13, "Daniel", "Sales", 62000, 36),
                new Employee(14, "Mia", "IT", 98000, 42),
                new Employee(15, "Lucas", "Finance", 68000, 24)
        );


        List<Employee> SortEmp=employees.stream()
                .sorted(
                        Comparator.comparing(Employee::department)
                .thenComparing(
                        Comparator.comparingDouble(Employee::salary).reversed()
                )
                ).toList();

        System.out.println(SortEmp);
    }
}
