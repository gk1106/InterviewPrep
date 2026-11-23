package java_prep.streamApiPrograms;

import java_prep.InterviewPrepare.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HaighPaidEmp {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "Arun", "IT", 55000, 25),
                new Employee(2, "Priya", "HR", 45000, 28),
                new Employee(3, "Karthik", "IT", 75000, 32),
                new Employee(4, "Divya", "Finance", 60000, 29),
                new Employee(5, "Ravi", "Sales", 40000, 24),
                new Employee(6, "Sneha", "IT", 85000, 35),
                new Employee(7, "Vijay", "HR", 50000, 30),
                new Employee(8, "Meena", "Finance", 70000, 33),
                new Employee(9, "Suresh", "Sales", 48000, 27),
                new Employee(10, "Anitha", "IT", 95000, 40),
                new Employee(11, "Prakash", "Marketing", 52000, 31),
                new Employee(12, "Kavya", "HR", 62000, 34),
                new Employee(13, "Manoj", "Finance", 80000, 38),
                new Employee(14, "Lakshmi", "Sales", 58000, 29),
                new Employee(15, "Ganesh", "Marketing", 65000, 36),
                new Employee(16, "Nithya", "IT", 72000, 26),
                new Employee(17, "Bala", "Sales", 35000, 22),
                new Employee(18, "Swathi", "Finance", 90000, 41),
                new Employee(19, "Dinesh", "Marketing", 47000, 25),
                new Employee(20, "Harini", "IT", 68000, 28)
        );

        Map<String,Optional<Employee>> highSalByDept=employees.stream()
                .collect(Collectors.groupingBy(Employee::department,
                Collectors.maxBy(Comparator.comparingDouble(Employee::salary)))
                );

        System.out.println(highSalByDept);

    }
}
