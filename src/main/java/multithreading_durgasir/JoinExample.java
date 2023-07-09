package multithreading_durgasir;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 finished");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 started");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 finished");
        });

        thread1.start();
        thread2.start();

        System.out.println("Main thread started");

        thread1.join(); // Wait for thread1 to finish
        System.out.println("Thread 1 joined");

        thread2.join(); // Wait for thread2 to finish
        System.out.println("Thread 2 joined");

        System.out.println("Main thread finished");
    }
}
