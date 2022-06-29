package DataStructures.Queue;

public class Queue {
    private int arr[];
    private int head=-1;
    private int tail=-1;

    private int numberOfItems=0;

    public Queue(int size)
    {
        arr=new int[size];
    }

    public void enqueue(int a){
        if(isQueueFull())
            throw new RuntimeException("queue is full");
        if (tail == arr.length-1) // deal with circular case
            tail = -1;
        if(head==-1)
            head++;
        arr[++tail]=a;
        numberOfItems++;


    }
    public  int dequeue(){

        if(isQueueEmpty())
            throw new RuntimeException("queue is empty");
    if(head==arr.length-1)
    head=-1;
        numberOfItems--;
        return arr[++head];
    }
    public int peek(){
        return arr[head];
    }
    public boolean isQueueEmpty(){
       return numberOfItems==0;
    }

    public boolean isQueueFull() {
            return numberOfItems==arr.length;
    }

   public String toString() {

       String result = "{";
       if(head>tail) {


           for (int i = tail; i <numberOfItems; i++) {
               result = result + arr[i] + ",";
           }
           result += "}";
       }
       else
       {

           for (int i = head; i <= numberOfItems; i++) {
               result = result + arr[i] + ",";
           }
           result += "}";
       }


       return result;

   }

}
