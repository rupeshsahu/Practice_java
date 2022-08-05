package collectoins_pratice;

import java.util.LinkedHashSet;

public class LInked_hashset_example {
    public static void main(String[] args) {
        LinkedHashSet ls=new LinkedHashSet<>();
        ls.add("A");
        ls.add("b");
        ls.add("c");
        ls.add("d");
        ls.add(null);
        ls.add("f");
        ls.add("g");
        System.out.println(ls.add("A"));
        System.out.println(ls);

    }
}
