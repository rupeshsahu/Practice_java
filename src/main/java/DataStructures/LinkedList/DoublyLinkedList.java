package DataStructures.LinkedList;

public class DoublyLinkedList {

   private DoublyNode head;
   public  void insetAtHead(int data){
       DoublyNode newNode=new DoublyNode(data);
       newNode.setPostNode(this.head);
       if(this.head!=null){
           this.head.setPreNode(newNode);
       }
       this.head=newNode;

   }

}
