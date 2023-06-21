package StreamAPI;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class ListOfOrders {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(18);
        list.add(29);
        list.add(200);
        list.add(15);
        list.add(16);
        list.add(17);
       // Collections.sort(list);
       Comparator<Integer> c=(o1,o2)->(o1<o2)?-1:(o1>o2)?1:0;
      Collections.sort(list,c);
    //   list.stream().forEach(System.out::println);
         list.stream().filter(i->i%2==0).collect(Collectors.toList());
    }
}

