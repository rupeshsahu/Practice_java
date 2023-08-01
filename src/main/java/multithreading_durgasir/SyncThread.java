package multithreading_durgasir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncThread {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> list=new ArrayList();

      // Collections.synchronizedList(list);

        Thread thread1=new Thread(()->{
            for(int i=1;i<=5;i++)
                list.add(i);
            }
        );

        Thread thread2=new Thread(()->{
            for(int i=6;i<=10;i++)
                list.add(i);

        }
        );


        thread2.start();
        thread1.start();
      Thread.sleep(4000);
        System.out.println(list);

    }


}
