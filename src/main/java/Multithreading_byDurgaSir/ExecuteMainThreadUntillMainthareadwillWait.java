package Multithreading_byDurgaSir;


class RupeshsThread extends  Thread{
    public static Thread mt;

    public  void run(){
        try {
            mt.join(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i=0;i<10;i++){
            System.out.println("child Thread"+i+Thread.currentThread().getName());

        }

    }
}

public class ExecuteMainThreadUntillMainthareadwillWait {
    public static void main(String[] args) throws InterruptedException {
        RupeshsThread.mt=Thread.currentThread();
        RupeshsThread t1=new RupeshsThread();
        t1.start();

        for(int i=0;i<10;i++){
            Thread.sleep(1000);
            System.out.println("main Thread"+i+Thread.currentThread().getName());

        }

    }
}
