package collectoins_pratice;

import java.util.HashSet;

public class Set_example {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add("A");
        hs.add("b");
        hs.add("c");
        hs.add("d");
        hs.add(null);
        hs.add("f");
        hs.add("g");
        System.out.println(hs.add("A"));
        System.out.println(hs);

    }
}
