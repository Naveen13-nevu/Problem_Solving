
interface PayementService{
    void pay();
}

class PayementServiceImpl implements PayementService{
    
    public void pay(){
        System.out.println("Paid using upi");
    }
}

class crediCardImpl implements PayementService
{
    public void pay(){
        System.out.println("Paid using credit card");
    }
}

public class InterfaceExamples {
   
    public static void main(String[] args) {
        
        PayementService p = new PayementServiceImpl();
        PayementService c = new crediCardImpl();
        c.pay();
        p.pay();


    }
}
