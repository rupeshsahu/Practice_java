package Multithreading_byDurgaSir;


class counting{

    public void countingNumber() throws InterruptedException {
        synchronized (this) {
            for (int i = 1; i <=10; i++) {
                if (i==5)
                    this.wait();
                System.out.println(i);
                Thread.sleep(50);
            }
        }
    }

    public void alphabetsPrint() throws InterruptedException {
        synchronized (this) {
            for (int i = 65; i <= 90; i++) {
                System.out.println((char) i);
                Thread.sleep(50);
            }
            this.notifyAll();
        }
    }
}


public class InterThreadComminication {

    public static void main(String[] args) {
        counting c=new counting();

        Runnable r=()->{
            try {
                c.countingNumber();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        };

        Runnable r1=()->{
            try {
                c.alphabetsPrint();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread t1=new Thread(r);
        Thread t2=new Thread(r1);
     //   Thread t3=new Thread(r);
        t1.start();
        t2.start();
        //t3.start();
    }
}
