package DataStructures.LinkedList;

public class LinkedListImplemantation {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();

        l.insertAtHead(16);
        l.insertAtHead(15);
       // l.insertAtHead(14);
        l.insertAtHead(13);
        l.insertAtHead(12);
        System.out.println(l);
      //  System.out.println(l.findData(16));
      /*  l.deleteHeadNode();
        l.deleteHeadNode();
        l.deleteHeadNode();*/
        l.insertSortedLL(14);
        System.out.println(l);

      //  System.out.println(Length(l.getHead()));

    }


    public static int Length (Node n){
        int l=0;
        while(n!=null){
            n=n.getNextNode();
            l++;
        }


        return l;
    }




}
