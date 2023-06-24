package collectoins_pratice.LIst_interface;

import java.util.LinkedList;
import java.util.List;

public class LL_practice {
    public static void main(String[] args) {


        LinkedList<String> list= new LinkedList();
        list.add("Rupesh");
        list.add("Sahu");
        list.add("is");
        list.add("Good");
        list.add("Guy");
        System.out.println(
                list
        );

        list.addFirst("addfirst");
        list.addLast("addlast");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);



    }
}
