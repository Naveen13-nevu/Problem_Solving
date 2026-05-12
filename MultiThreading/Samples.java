
    
    class A implements Runnable{
        public synchronized  void run(){
            for(int i=0;i<=2;i++){
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Hi");
            }
        }
    }

    class B implements Runnable{
        public synchronized  void run(){
            for(int i=0;i<=2;i++){
                 try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Hello");
            }
        }
    }
public class Samples {
    public static void main(String[] args) throws InterruptedException {

        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t1.join();
        t2.start();



        
    }
}
