
interface credit{
    void creditPay();
}
interface Debit{
    void debitPay();
}

class payment implements credit,Debit{
    
    public void creditPay(){
        System.out.println("Payment using credit card");
    }

    public void debitPay(){
        System.out.println("payment using debit card");
    }
}

public class MultipleInheritanceUsingInterface {
    
    public static void main(String[] args) {
        
        credit c = new payment();
        c.creditPay();
        Debit d = new payment();
        d.debitPay();

    }
}
