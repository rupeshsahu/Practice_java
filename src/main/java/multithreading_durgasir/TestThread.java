package multithreading_durgasir;

public class TestThread {

    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(()->{
            for(int i=1;i<=10;i++){
                System.out.println(i+" "+Thread.currentThread().getPriority());

            }
        });
       // thread.setPriority(10);

        thread.start();
        Thread.yield();


        for(int i=1;i<10;i++)
        System.out.println("this is main Thread "+Thread.currentThread().getPriority()+ Thread.currentThread().getName());
    }
}
