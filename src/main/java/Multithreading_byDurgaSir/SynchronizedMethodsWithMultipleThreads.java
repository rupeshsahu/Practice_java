package Multithreading_byDurgaSir;



class Dispay {
    public synchronized void wish(String name) {

        for (int i = 0; i < 10; i++) {
            System.out.print("Good Morning: ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " I am interrupted");

            }
            System.out.println(name);
        }
    }
}

public class SynchronizedMethodsWithMultipleThreads {

    public static void main(String[] args) {

   Dispay d =new Dispay();

        Runnable r=()->{
            d.wish(Thread.currentThread().getName());


        };

        Thread t1=new Thread(r,"Rupesh");
        Thread t2=new Thread(r,"Puneet");
        t1.start();
        t2.start();


    }


}
