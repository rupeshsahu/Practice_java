
import java.util.ArrayList;
import java.util.List;

public class JavaMemoryLeakTest {

    public  List<Double> list=new ArrayList<>();


    public static void main(String[] args) throws InterruptedException {
        System.out.println("debug point 1");
        new JavaMemoryLeakTest().populateList();
        System.out.println("debug point 3");

    }

    public void populateList() throws InterruptedException {

        for (int i=0;i<100000;i++){
            list.add(Math.random());
        }
        System.out.println("Debug point 2");
    }
}
