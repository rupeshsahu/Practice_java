package multithreading_durgasir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyThread {
    public static void main(String[] args) throws InterruptedException {

        List list=new ArrayList<>();
        list.add(11);
        list.add(21);
        list.add(14);
        list.add(31);
        list.add(15);
        list.add(20);
        //Collections.synchronizedList(list);

        Runnable r=()->{
            for(int i=0;i<list.size();i++)
            System.out.println(Thread.currentThread().getName()+"  "+i);


        };

        Thread thread=new Thread(r);
        thread.setPriority(Thread.MAX_PRIORITY);
        Thread thread1=new Thread(r);
       thread.start();
       thread1.start();
        thread.join();
        //thread1.join();


        for(int i=0;i< list.size();i++)
            System.out.println(Thread.currentThread().getName()+"  "+i);


    }
}
