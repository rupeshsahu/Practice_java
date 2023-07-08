package MapInterf;

import java.util.TreeMap;

public class TreeMap_practice {

    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>((o2,o1)->o1.compareTo(o2));
        tm.put(1,"Rupesh");
        tm.put(2,"Sahu");
        tm.put(3,"aman");
        tm.put(4,"tulsi");
        tm.put(5,"saransh");
        tm.put(6,"shubham");
       // tm.put(null,"this is null key value");
        System.out.println(tm

        );

    }
}
