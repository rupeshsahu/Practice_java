package DataStructures.Queue;

public class ImplementQueue {

    public static void main(String[] args) {
        Queue q=new Queue(3);
        q.enqueue(12);
        q.enqueue(13);
        q.enqueue(14);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.enqueue(15);


        System.out.println(q.dequeue());





        /*q.enqueue(12);
        q.enqueue(13);
        System.out.println(q.isQueueFull());
        q.enqueue(14);
        System.out.println(q.isQueueFull());
        System.out.println(q);
        q.enqueue(14);*/







    }
}
