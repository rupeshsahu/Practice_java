package collectoins_pratice.CursorsInCollection;

import java.util.*;
import java.util.stream.IntStream;

public class AllCuursors {
    public static void main(String[] args) {
        ArrayList<Integer> al =new ArrayList<>();
        Vector<Integer> v =new Vector<>();
        IntStream.range(1,11).forEach(i->al.add(i));
        IntStream.range(1,11).forEach(i->v.add(i));
        Enumeration e=v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());

        }
        Iterator i=al.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        ListIterator li=al.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());

        }



    }
}
