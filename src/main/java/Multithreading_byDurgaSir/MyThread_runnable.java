package Multithreading_byDurgaSir;

public class MyThread_runnable implements Runnable{
    public  void run(){
        System.out.println("Runnable interface thread2");
        Thread.currentThread().setName("RupeshSahu");
        System.out.println(Thread.currentThread().getName()+Thread.currentThread().getId());
    }


}
