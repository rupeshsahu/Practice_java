package collectoins_pratice.Queue_practice;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_practice {
    public static void main(String[] args) {
        PriorityQueue q=new PriorityQueue();
      //  q.offer(null); while adding null will get NPE
        q.add(12);
        q.add(16);
        q.add(54);
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q);
        System.out.println(q.element());
        System.out.println(q.size());



    }
}
