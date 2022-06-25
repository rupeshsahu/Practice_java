package multithreading;

import java.util.TreeMap;

public class synchronized_method {


    static int count=1;

    public  static int getID(){
        return count=count+1;

    }
    public static void main(String[] args) {
int x=2;
        A a=new A();
        Runnable r=()->{
            try {

synchronized (a){
    a.blastBomb();

}


            }
            catch(Exception e)
            {
                System.out.println(e);
            }

        };
        Thread t1=new Thread(r,"ThreadA");
        t1.start();
        Thread t2=new Thread(r,"ThreadB");
        t2.start();


//











    }
}
