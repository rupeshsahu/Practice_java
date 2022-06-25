package DataStructures.LinkedList;

public class DoublyNode {
    private DoublyNode preNode;
   private DoublyNode postNode;
   private int data;

    public DoublyNode(int data) {
        this.data = data;
    }

    public DoublyNode getPreNode(){
       return preNode;
   }
   public void setData(int data){
       this.data=data;
   }

    public void setPreNode(DoublyNode preNode) {
        this.preNode = preNode;
    }

    public DoublyNode getPostNode() {
        return postNode;
    }

    public void setPostNode(DoublyNode postNode) {
        this.postNode = postNode;
    }

    public int getData() {
        return data;
    }
}
