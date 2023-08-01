package multithreading_durgasir;

public class ThreadInterruption {

    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(()->{
            for(int i=0;i<10;i++) {
                System.out.println(Thread.currentThread().getName());

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName()+" is interrupted");
                    throw new RuntimeException(e);
                }
            }

        });
        t.start();
        Thread.sleep(5000);
        t.interrupt();

    }
}
