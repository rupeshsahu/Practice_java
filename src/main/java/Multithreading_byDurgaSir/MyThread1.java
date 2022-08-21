package Multithreading_byDurgaSir;

public class MyThread1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++) {

            System.out.println("this is child thread1 " + i +Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // System.out.println(Thread.currentThread().getPriority()+"Child");
        }

    }


}
