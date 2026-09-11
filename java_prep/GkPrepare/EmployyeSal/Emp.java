package java_prep.GkPrepare.EmployyeSal;

import java_prep.GkPrepare.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Emp {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Ganeshkumar",25,80000,"IT"),
                new Employee("Aksay",26,90000,"IT"),
                new Employee("Akash",30,40000,"HR"),
                new Employee("Rahul",23,50000,"IT"),
                new Employee("Priya",26,30000,"IT"),
                new Employee("Divya",22,20000,"HR")
        );


        String name=employees.stream()
                .filter(n->n.getDepartment().equalsIgnoreCase("IT") && n.getSalary() >= 50000)
                .findFirst().get().getName();

        System.out.println(name);

    }
}
