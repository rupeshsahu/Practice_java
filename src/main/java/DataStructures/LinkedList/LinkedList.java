package DataStructures.LinkedList;

public class LinkedList {
    private Node head;

   /* public Node getHead() {
        return head;
    }*/

    public void insertAtHead(int data){

        Node newNode=new Node();
        newNode.setData(data);
        newNode.setNextNode(this.head);
        this.head=newNode;

    }

    public Node findData(int data){
        Node current=new Node();
        current=this.head;
        while(current!=null){
            if(current.getData()==data){
                return current;
            }

            current=current.getNextNode();
        }
        return null;

    }

    public void insertSortedLL(int data){
        Node curr=new Node();
        curr=this.head;
        Node newNode=new Node();
        newNode.setData(data);

        while(curr!=null){

            if(curr.getNextNode().getData()>data)
            {
                newNode.setNextNode(curr.getNextNode());
                curr.setNextNode(newNode);
                break;

            }
            curr=curr.getNextNode();



        }

    }
    public void deleteHeadNode(){
        Node current=new Node();
        current=this.head;
        this.head=this.head.getNextNode();    }
    public  String toString() {
        String result = "{";
        Node current = this.head;
        while (current != null) {
            result += current.toString() + ",";
            current = current.getNextNode();
        }
        result=result+"}";
        return result;


    }
}
