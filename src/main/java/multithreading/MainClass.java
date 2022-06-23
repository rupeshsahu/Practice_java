package multithreading;

public class MainClass {

    public static void main(String[] args) {

        Runnable r=()->{
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + "  " + i);
                    Thread.sleep(5000);
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

        };

        Runnable r1=()->{
            try {
               // for (int i = 0; i < 10; i++) {
                   // System.out.println(Thread.currentThread().getName() + "  " + i);
                System.out.println(" Road open for "+Thread.currentThread().getName());
                //System.out.println(Thread.currentThread().countStackFrames());
                   Thread.sleep(5000);
                //}
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

        };
       // Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);
        Thread t4=new Thread(r);
        Thread t5=new Thread(r);
        //t1.start();


            t2.start();
           t3.start();
//            t4.start();
//            t5.start();











    }
}
