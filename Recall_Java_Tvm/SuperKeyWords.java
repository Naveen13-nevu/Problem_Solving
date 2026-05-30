
class Animal{

    void sound(){
        System.out.println("Naveen");
    }
}
class Dog extends Animal{
    void song(){
        super.sound();
    }
}

public class SuperKeyWords {

    public static void main(String[] args) {
        
        Dog d = new Dog();
        d.song();
        
    }
}
