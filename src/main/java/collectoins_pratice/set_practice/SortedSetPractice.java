package collectoins_pratice.set_practice;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetPractice {
    public static void main(String[] args) {
        //Under laying DS of  Treeset is Balanced Tree.
        SortedSet<Integer> ss=new TreeSet<>();
        ss.add(12);
        ss.add(23);
        ss.add(44);
        ss.add(11);
      //  ss.add(null); // null is ot allowed in treeset
        System.out.println(ss);
        System.out.println(ss.first());
        System.out.println(ss.last());
        System.out.println(ss.headSet(23));
        System.out.println(ss.tailSet(23));
        System.out.println(ss.subSet(11,23));
        System.out.println(ss.first());


    }
}
