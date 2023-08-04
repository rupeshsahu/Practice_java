package ScalerProblems.LinkedListProblems;

public class LinkedListOperations {
    public static void main(String[] args) {
        Node headNode =null;
        addNode(headNode,1);
        addNode(headNode,2);
        addNode(headNode,3);
        addNode(headNode,4);
        addNode(headNode,5);
       // findNode(headNode,7);

    }

    public static void addNode(Node headNode,int value){
        Node temp = headNode;
        if(headNode!=null) {
            Node node = new Node(value, null);
            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }
            temp.nextNode = node;
        }
        else {
            headNode=new Node(value,null);
        }



    }

    public  static  void findNode(Node headNode,int i){
        boolean flag=false;
        while (headNode.nextNode!=null)
        {
            headNode=headNode.nextNode;
            if(headNode.value==i)
            {
                flag = true;
                break;
            }
        }
        if(flag==true)
        System.out.println("value  found "+ headNode.value);
        else
        System.out.println("value not found");


        }



    }

