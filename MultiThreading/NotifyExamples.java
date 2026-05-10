class Shared {

    synchronized void waitMethod(){
        try {
            System.out.println("thread is waiting ");
            wait();
            System.out.println("thread is resumed ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized void notifyMethod(){

        try {
            System.out.println("calling");
            notify();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
}

public class NotifyExamples {

    public static void main(String[] args) {

        Shared obj = new Shared();

        Thread t1 = new Thread(
            ()->{
                obj.waitMethod();
            }
        );

        Thread t2 = new Thread(
            ()->{
                try {
                    Thread.sleep(3000);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
                obj.notifyMethod();
            }
        );

        t1.start();
        t2.start();
        
    }
}