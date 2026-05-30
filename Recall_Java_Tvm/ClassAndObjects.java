
record Employee(int id, String name){

    void display(){
        System.out.println("Id: "+ id+" name: "+name);
    }
}

public class ClassAndObjects {
    
    public static void main(String[] args) {

        Employee e = new Employee(1, "Naveen");

        e.display();
    }
}
