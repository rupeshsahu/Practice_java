package collectoins_pratice.Queue_practice;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class BlockingQueuePractice {
    public static void main(String[] args) {
        BlockingQueue<Integer> bq= new PriorityBlockingQueue();
        bq.add(12);
        bq.add(2);
        bq.add(122);
        bq.add(32);
        bq.add(42);
        bq.add(120);
        System.out.println(bq);


    }
}
