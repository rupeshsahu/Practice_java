package Multithreading_byDurgaSir;

class Mythread extends Thread{
    Display d;
    String name;

    public Mythread(Display d,String name){

        this.d=d;
        this.name=name;
    }

    public void run()
    {
        d.wish(name);

    }

}


public class SynchronizedMethodByDurgasir {

    public static void main(String[] args)
    {
        Display d=new Display();
        Display d1=new Display();
        Display d2=new Display();
        Mythread t1=new Mythread(d1,"rupesh");
        Mythread t2=new Mythread(d2,"puneet");
        t1.start();
        t2.start();



    }
}

class Display{
      public synchronized void wish(String name) {

        for (int i = 0; i < 10; i++) {
            System.out.print("Good Morning: ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " I am interrupted");

            }
            System.out.println(name);
        }
    }

}

