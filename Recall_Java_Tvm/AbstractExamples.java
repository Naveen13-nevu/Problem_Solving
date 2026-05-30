
abstract class Payment{
    abstract void pay(double amount);
}

class UpiPayment extends Payment{

    @Override
    void pay(double amount){
        System.out.println("Paid using UPI "+ amount);
    }
}

class CreditCardPayment extends Payment{
    @Override
    void pay(double amount){
        System.out.println("Paid using Credit Card "+ amount);
    }
}

public class AbstractExamples {
    public static void main(String[] args) {

        Payment u = new UpiPayment();
        Payment c = new CreditCardPayment();
        u.pay(10000);
        c.pay(20000);
    }
}
