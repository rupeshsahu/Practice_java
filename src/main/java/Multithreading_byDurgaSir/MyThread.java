package Multithreading_byDurgaSir;

public class MyThread extends Thread{
    public void run(){
        for(int i=0;i<1;i++)
        System.out.println("this is child thread1 "+i);
    }
    /*public void start(){
        super.start();
        System.out.println("start method");
    }*/

}
