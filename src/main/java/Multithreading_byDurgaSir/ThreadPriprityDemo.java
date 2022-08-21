package Multithreading_byDurgaSir;



public class ThreadPriprityDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1=new MyThread1();
        MyThread1 t2=new MyThread1();
        t1.setPriority(1);

       /*t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);*/
        //Thread.yield();
        t1.start();
        t1.join(3000);
      //  Thread.yield();
        //Thread.sleep(1000);
//        t1.join();


        /*Thread.currentThread().setPriority(Thread.MIN_PRIORITY);*/
        for(int i=0;i<10;i++) {
            System.out.println("main thread" + i);
            //System.out.println(Thread.currentThread().getPriority()+"main");
        }


        }

        //Some os dont support  Thread priority concept, request of OS team to provide support



}
