import java.util.Arrays;
import java.util.List;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class SalaryFilter {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Naveen", 50000),
                new Employee(2, "Rocky", 70000),
                new Employee(3, "Arun", 40000)
        );

        employees.stream()
                .filter(emp -> emp.salary > 50000)
                .forEach(emp -> System.out.println(emp.name));
    }
}
