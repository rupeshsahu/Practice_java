package Multithreading_byDurgaSir;

public class ThreadTest {

    public static void main(String[] args) {
        Runnable r=()->{
            for(int i=0;i<10;i++)
            System.out.println(" this is my thread 1");
        };
        Thread t =new Thread(r);
        t.start();
        for (int i=0;i<10;i++)
        System.out.println(Thread.currentThread().getName());
    }
}
