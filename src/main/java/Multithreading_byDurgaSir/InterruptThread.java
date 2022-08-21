package Multithreading_byDurgaSir;
class RupeshsThread1 extends  Thread{


    public  void run(){

        for(int i=0;i<10;i++) {

            try {
            System.out.println("child Thread "+i);
           if(i==6)
               Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("inturrpted");;

            }
        }

    }
}

public class InterruptThread {
    public static void main(String[] args) {

        RupeshsThread1 t=new RupeshsThread1();
        t.start();
          t.interrupt();

    }
}
