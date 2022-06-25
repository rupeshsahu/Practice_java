package DataStructures.LinkedList;

public class DoublyendedL {
    private Node head;
    private  Node tail;

    public void insertAtTail(int data){
        Node newNode=new Node();
        newNode.setData(data);
        if(this.head==null){
            this.head=newNode;
        }
        if(this.tail !=null)
            this.tail.setNextNode(newNode);
        this.tail=newNode;
    }

    @Override
    public  String toString() {
        Node curr=new Node();
        String result="{";
        curr=this.head;
        while (curr!=null) {
            result += "data: " +curr.toString();
            curr=curr.getNextNode();
        }
        result+="}";
        return result;

    }






}
