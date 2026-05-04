
import java.util.*;
import java.util.stream.Collectors;

public class sortingSalary {

    public static void main(String[] args) {
        
        class Employee {
        String name;
        int salary;
    
        Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }
    }
        List<Employee> employees = Arrays.asList(
    new Employee("Naveen", 10000),
    new Employee("Karthi", 40000),
    new Employee("Praveen", 20000)
);


List<Employee> sorted = employees.stream()
    .sorted(Comparator.comparingInt(e -> e.salary))
    .collect(Collectors.toList());

sorted.forEach(e -> 
    System.out.println(e.name + " = " + e.salary));
    }
    
}
