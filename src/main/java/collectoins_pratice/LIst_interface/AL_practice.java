package collectoins_pratice.LIst_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class AL_practice {

    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<Integer>(12);

        int i=0;
        do {
            list.add((int) (Math.random()/Math.nextDown(.1)));
            i++;
        }while(i<10);

       // list.add(null);
       // list.add("String");



        /*Iterator<Integer> i1= list.listIterator();
      while(i1.hasNext()){
          //System.out.println(i1.next());
      }*/
        System.out.println(list);
     list= (ArrayList<Integer>) list.stream().filter(a->(Integer)a<5).collect(Collectors.toList());
        System.out.println(list);
      list.stream().forEachOrdered(System.out::println);
      Collections.synchronizedList(list); // now list is synchronized.


    }


}
