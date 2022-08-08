package collectoins_pratice;

import java.util.*;

public class HashMap_practice {

    public static void main(String[] args) {


        List l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(5);
        l.add(4);
        l.add(5);

        HashSet s=new HashSet(l);
        System.out.println(s);


        HashMap<Integer,String> hm =new HashMap<Integer, String>();
        hm.put(null,null);
        hm.put(null,"puneet");
        hm.put(103,"pranjal");
        hm.put(104,"shubham");
        hm.put(105,"anil");
        hm.put(106,"Deepesh");
        System.out.println(hm.put(106,"replace"));
        System.out.println(hm.get(101));
       // hm.remove(101);
        System.out.println(hm.values());
        System.out.println(hm.size());
       // hm.clear();

        for(Map.Entry<Integer,String> m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println(hm);

        Set s1=hm.entrySet();
        Set s2=hm.keySet();
        System.out.println(hm.isEmpty());

        System.out.println(s1);
        System.out.println(hm.containsKey(101));
        System.out.println(hm.containsValue("Rupesh"));
        Iterator itr= s1.iterator();
        while(itr.hasNext()){
            Map.Entry m1=(Map.Entry)itr.next();
            System.out.println("key="+m1.getKey()+"  Value="+m1.getValue());
        }
    }
}
