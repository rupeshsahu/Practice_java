package collectoins_pratice.Queue_practice;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_practice {
    public static void main(String[] args) {
        Queue q=new PriorityQueue();
        q.add(12);
        q.add(16);
        q.add(54);
       /* System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.remove());*/
        System.out.println(q);
        System.out.println(q.size());
    }
}
