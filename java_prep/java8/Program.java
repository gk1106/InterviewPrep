package java_prep.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

//        List<String> names =
//                Arrays.asList("John", "Alex", "Bob", "Andrew", "David");
//
//
//        Map<String, Integer> nameMap = names.stream()
//                        .collect(Collectors.toMap(name->name,name->name.length()));
//
//
//   System.out.println(nameMap);

        List<Employee> employees = Arrays.asList(
                new Employee(101, "John"),
                new Employee(102, "Alex"),
                new Employee(103, "Bob")
        );


        Map<Integer,String> EmpMap=employees.stream()
                .collect(Collectors.toMap(
                        Employee::getId,
                        Employee::getName
                ));


     System.out.println(EmpMap
     );

    }
}
