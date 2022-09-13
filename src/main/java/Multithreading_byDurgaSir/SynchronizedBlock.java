package Multithreading_byDurgaSir;



class Display1{

    public void wish(String name){

synchronized (this) {
    for (int i = 0; i < 10; i++) {
        System.out.print("good morning: ");
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {

        }
        System.out.println(name);
    }
}
    }

}

public class SynchronizedBlock  {

    public static void main(String[] args) {

        Display1 d =new Display1();
        String name;

        Runnable r=()->{

            d.wish(Thread.currentThread().getName());



        };

        Thread t1 =new Thread(r,"RUPesh");
        Thread t2=new Thread(r,"Puneet");
        t1.start();
        t2.start();
    }
}
