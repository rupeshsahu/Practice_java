package multithreading_durgasir;

public class NumberPrinter implements Runnable {


    int num;

    public NumberPrinter(int i){
        this.num=i;
    }
    @Override
    public void run() {
        System.out.println(num+" "+Thread.currentThread().getName());

    }
}
