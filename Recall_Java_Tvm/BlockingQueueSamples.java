
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class BlockingQueueSamples {
    public static void main(String[] args) {
        
        BlockingQueue<String> que = new ArrayBlockingQueue<>(3);

        Thread Producer = new Thread(
            ()->{
                try {
                     que.put("order 1");
                System.out.println("Producer order 1");
                que.put("order 2");
                System.out.println("Producer order 2");
                } catch (Exception e) {
                    e.printStackTrace();
                }
               
            }

        );

        Thread consumer = new Thread(
            ()->{
                try {
                   Thread.sleep(2000);
                System.out.println("Consumed"+que.take());
                System.out.println("Consumed"+que.take()); 
                } catch (Exception e) {
                    e.printStackTrace();
                }
                

            }
        );

        Producer.start();
        consumer.start();

    }
}
