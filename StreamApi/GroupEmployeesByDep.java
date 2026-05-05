import java.util.*;
import java.util.stream.Collectors;

class Employee{

private String name;
private String department;
private double salary;

public Employee(String name, String department,double salary){
    this.name = name;
    this.department=department;
    this.salary=salary;
}

public void setName(String name){
    this.name = name;
}

public void setDepartment(String department){
    this.department = department;
}

public void setSalary(double salary){
    this.salary=salary;
}

public String getName(){
    return name;
}

public String getDepartment(){
    return department;
}
public double getSalary(){
    return salary;
}
@Override
public String toString(){
    return name + " - " + salary+ " - "+ department ;
}
}

public class GroupEmployeesByDep {
    
    public static void main(String[] args) {
        
        List<Employee> list = Arrays.asList(
            new Employee("Naveen", "Software developer", 100000),
            new Employee("Arun", "HR", 40000),
            new Employee("Kumar", "IT", 60000),
            new Employee("Divya", "HR", 45000),
            new Employee("Raj", "Software developer", 70000)
        );
        
        //Group by department 
        Map<String, List<Employee>> grouped = list.stream()
        .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(grouped);

    }
}
