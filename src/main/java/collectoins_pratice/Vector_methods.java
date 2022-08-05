package collectoins_pratice;

import java.util.*;

public class Vector_methods {

    public static void main(String[] args) {
        Vector v=new Vector(10,5);
        System.out.println(v.capacity());

        for(int i=1;i<=10;i++)
        v.addElement(i);
        v.addElement(11);
        System.out.println(v.capacity());
        System.out.println(v);
        System.out.println(v.elementAt(2));
        v.removeElement(10);
        System.out.println(v);
        v.removeElementAt(7);
        System.out.println(v);
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        //v.removeAllElements();
        System.out.println(v);
        Enumeration e=v.elements();
        System.out.println(e.nextElement());
        System.out.println(e.nextElement());



    }


}
