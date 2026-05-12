public class UsingLambdaExp {
    
    public static void main(String[] args) {
        
        Runnable obj1 = ()-> {
            
            for(int i=0;i<=2;i++){
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
            }
        
        };
        Runnable obj2 = ()-> {
            
            for(int i=0;i<=2;i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
            }
        
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
