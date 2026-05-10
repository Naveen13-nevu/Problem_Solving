

class Book extends Thread{

   public synchronized  void run(){
        for(int i=0;i<=3;i++){
           System.out.println("Update Db"); 
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
            e.printStackTrace();
           }
        }
    }
}
class Bag extends Thread{

   public synchronized  void run(){
        for(int i=0;i<=3;i++){
           System.out.println("bag Db"); 
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
            e.printStackTrace();
           }
        }
    }
}

public class MultiThreading {

    public static void main(String[] args) throws InterruptedException {
        
        Book b1 = new Book();
        Bag b2 = new Bag();
        b1.start();
        b1.join();
        b2.start();  
    }
}
