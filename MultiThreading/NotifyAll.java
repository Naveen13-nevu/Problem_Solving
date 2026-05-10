class Shared {

    synchronized void waitMethod(int id) {

        try {
            System.out.println("Thread " + id + " waiting...");
            wait();
            System.out.println("Thread " + id + " resumed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void notifyAllMethod() {

        System.out.println("Calling notifyAll()");
        notifyAll(); // wakes all waiting threads
    }
}

public class NotifyAll {

    public static void main(String[] args) {

        Shared obj = new Shared();

        Thread t1 = new Thread(() -> obj.waitMethod(1));
        Thread t2 = new Thread(() -> obj.waitMethod(2));
        Thread t3 = new Thread(() -> obj.waitMethod(3));

        Thread t4 = new Thread(() -> {

            try {
                Thread.sleep(2000);
            } catch (Exception e) {}

            obj.notifyAllMethod();
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}