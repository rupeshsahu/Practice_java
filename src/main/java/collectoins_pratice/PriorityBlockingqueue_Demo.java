package collectoins_pratice;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityBlockingqueue_Demo {
    public static void main(String[] args) {
        PriorityQueue q=new PriorityQueue<>();
        q.offer("C");
        q.offer("B");
        q.offer("A");
        q.offer("D");
        q.offer("E");
        q.offer("F");

        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q);

    }
}
