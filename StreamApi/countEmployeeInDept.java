import java.util.*;

public class countEmployeeInDept {

    record Employee(int id, String name, String dept, double salary, int age) {

    }


    public static void main(String[] args) {
        
        List<Employee> emps = Arrays.asList(
    new Employee(1, "Ravi", "IT", 80000, 30),
    new Employee(2, "Priya", "HR", 50000, 28),
    new Employee(3, "Arun", "IT", 95000, 35),
    new Employee(4, "Meena", "Finance", 70000, 32),
    new Employee(5, "Kiran", "HR", 55000, 26));

    // count employee in each dept

    // Map<String, Long> count = emps.stream()
    // .collect(Collectors.groupingBy(Employee::dept, Collectors.counting()));

    // System.out.println(count);

    // avg salary per department 

    // Map<String,Double> avg = emps.stream()
    //         .collect(Collectors.groupingBy(Employee::dept, Collectors.averagingDouble(Employee::salary)));

    //         System.out.println(avg);

    }


}
