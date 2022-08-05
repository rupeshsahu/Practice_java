package collectoins_pratice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_example {

    public static void main(String[] args) {

        List l=new ArrayList();
        for(int i=0;i<=10;i++)
            l.add(i);
        ListIterator ltr=l.listIterator();

        while(ltr.hasNext()){
          //  System.out.println(ltr.previousIndex());

if ((Integer)ltr.next()==10) {

    ltr.set(12);
    ltr.add(13);
}

           // System.out.println(ltr.previous());
        }
        System.out.println(ltr.previous());
        System.out.println(ltr.previousIndex());

        System.out.println(l);
    }
}
