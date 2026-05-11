
public class DeadLock {

    static Object lock1 = new Object();
    static Object lock2 = new Object();
	
	public static void main(String[] args) {

		Thread t1 = new Thread(
			()->{
				synchronized (lock1) {
					
					System.out.println("Thread 1: Holding lock 1");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}

					System.out.println("Thread1 is waiting for Lock 2");
					synchronized (lock2) {
						System.out.println("Thread 1: Acquire lock 2");
					}
				}
			}
		);
		
		Thread t2 = new Thread(
			()->{
				synchronized (lock2) {
					System.out.println("Thread 2: Holding the lock 2 ");

					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("Thread 2 is waiting for Lock 1");
					synchronized(lock1){
						System.out.println("Thread 2: Acquire lock 1");
					}
				}
			}
		);
		t1.start();
		t2.start();
	}

}
