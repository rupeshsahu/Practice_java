package Multithreading_byDurgaSir;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread1 t=new MyThread1();

        MyThread_runnable r=new MyThread_runnable();
        Thread t1=new Thread(r,"ThreadUsingRunnable t1");
        Thread t2=new Thread(r,"ThreadUsingRunnable t2");
        t1.start();


        t2.start();


        for(int i=0;i<1 ;i++){
            System.out.println("main thread "+i );
        }
    }
}
