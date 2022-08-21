package Multithreading_byDurgaSir;

public class SynchronizationInThreads {
    public static void main(String[] args) {
        Runnable r=()->{

           // for(int i=0;i<10;i++)
                //System.out.println(" Chlid Thread"+i);
            threadTest();
            threadTest1();
           //   threadTes3();


        };

        Thread t1=new Thread(r,"Thread1");
        Thread t2=new Thread(r,"Thread2");
        Thread t3=new Thread(r,"Thread3 ");

        t1.start();
        t2.start();
        t3.start();




    }
    public static synchronized void threadTest(){
        for(int i=0;i<10;i++)
        System.out.println("m1: synchrinozed Method using Thread name"+Thread.currentThread().getName()+i);
    }

    public static synchronized void threadTest1(){
        for(int i=0;i<10;i++)
            System.out.println("m2: synchrinozed Method using Thread name"+Thread.currentThread().getName()+i);
    }

    public static  void threadTes3(){
        for(int i=0;i<10;i++)
            System.out.println("m3: synchrinozed Method using Thread name"+Thread.currentThread().getName()+i);
    }
}
