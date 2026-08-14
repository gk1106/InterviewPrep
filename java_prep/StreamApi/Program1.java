package java_prep.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Program1 {
    public static void main(String[] args) {

        List<Employee> Emplist =
                Arrays.asList(
                        new Employee("ganeshkumar",25,80000,"IT"),
                        new Employee("dinesh",22,40000,"IT"),
                        new Employee("Rajesh",25,50000,"Admin")
                );


        List<String> LeadEmplist=Emplist.parallelStream()
                .filter(employee -> employee.getSalary() >=  5000 )
                .map(employee->employee.getName())
                .toList();

               System.out.println(LeadEmplist);



    }
}
