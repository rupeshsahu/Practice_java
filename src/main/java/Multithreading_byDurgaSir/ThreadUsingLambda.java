package Multithreading_byDurgaSir;

public class ThreadUsingLambda {

    public static void main(String[] args) throws InterruptedException {
        Thread mt;
        mt=Thread.currentThread();
        Runnable r=()->{

            try {
                mt.join(5000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for(int i=0;i<10;i++)
                System.out.println("Child Thread "+i+Thread.currentThread().getName());

        };


        Thread t1=new Thread(r,"Rupesh");
        t1.start();

       // t1.join();
        for(int i=0;i<10;i++) {
            Thread.sleep(1000);
            System.out.println("Main Thread " + i);
        }

    }
}
