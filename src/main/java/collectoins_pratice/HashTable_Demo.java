package collectoins_pratice;

import java.util.Hashtable;

public class HashTable_Demo {

    public static void main(String[] args) {
        Hashtable t=new Hashtable<>(20);
        t.put(new temp(5),"A");
        t.put(new temp(2),"B");
        t.put(new temp(6),"C");
        t.put(new temp(15),"D");
        t.put(new temp(23),"E");
        t.put(new temp(16),"F");
        System.out.println(t);




    }
}
