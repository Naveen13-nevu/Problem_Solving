
public class Threading {
    
    public static void main(String[] args) {
        
        for(int i=0;i<=5;i++){
            int threadNumber =i;

            Thread t1 = new Thread(
                ()->{
                    System.out.println("Thread "+ threadNumber+"is running");
                }
            );
         
           
            Thread t2 = new Thread(
                ()->{
                    System.out.println("Thread is running");
                }
            );

               t1.start();

                try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            t2.start();
        }

    }
}
