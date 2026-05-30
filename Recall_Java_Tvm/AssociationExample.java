
class Department{

    String name;

    Department(String name){
        this.name = name;
    }
    
}

class Employee{
    String employeeName;
    Department departmentName;

    Employee(String employeeName, Department departmentName) {

        this.employeeName = employeeName;
        this.departmentName = departmentName;
    }
    
    void display(){
        System.out.println(employeeName+" works in "+departmentName.name);
    }
    
}

public class AssociationExample {
    
    public static void main(String[] args) {
        
        Department d = new Department("It");
        Employee e = new Employee("Naveen", d);

        e.display();

    }
}
