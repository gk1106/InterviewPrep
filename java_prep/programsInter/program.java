package java_prep.programsInter;

import java_prep.StreamApi.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class program {
    public static void main(String[] args) {

//        List<Employee> employees = Arrays.asList(
//                new Employee("ganeshkumar", 26, 80000, "IT"),
//                new Employee("kumar", 22, 40000, "IT"),
//                new Employee("aravind", 29, 70000, "Accounts"),
//                new Employee("gokul", 26, 60000, "Media"),
//                new Employee("arun", 24, 50000, "Media")
//        );
//
//        Map<String,Optional<Employee>> result=employees.stream()
//                .collect(Collectors.groupingBy(
//                        Employee::getDepartment,
//                        Collectors.maxBy(
//                                Comparator.comparing(Employee::getSalary)
//
//                        )
//                ));


               List<Integer> list=Arrays.asList(50,40,30,20,10,1,20,30,40);


//               Set<Integer> num=new TreeSet<>();
//
//               for(Integer i:list){
//
//                   num.add(i);
//               }


        List<Integer> list2=list.stream()
                .distinct()
                .sorted()
                .toList();

        System.out.println(list2);

    }
}
