
import java.util.*;
import java.util.stream.Collectors;

public class sortBySalaryAscending {

    public static void main(String[] args) {
        
        class Employee{
            String name;
            double salary;


            Employee(String name,double salary){
                this.name = name;
                this.salary = salary;
            }
        }

        List<Employee> employees =  Arrays.asList(
         new Employee("naveen", 10000),
            new Employee("arun", 40000),
            new Employee("diwakar", 30000)
        );

        List<Employee> sorted = employees.stream()
        .sorted(Comparator.comparingDouble(e -> e.salary))
        .collect(Collectors.toList());

        sorted.forEach(e -> 
    System.out.println(e.name + " = " + e.salary));
    }

    }


