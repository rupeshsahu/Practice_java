package ScalerProblems.HashMapProblems;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        HashMap<Integer,String> hm=new HashMap<>();
       // System.out.println(hm.put(101,"Rupesh"));
        System.out.println(hm.put(102,"Aman"));
        System.out.println(hm.put(103,"Puneet"));
        System.out.println(hm.put(104,"Shubham"));
        System.out.println(hm.put(105,"Anil"));


//        HashMap<Integer,String> hm1=new HashMap<>();
//        hm1.putAll(hm);
//        System.out.println(hm1);

        //System.out.println(hm.remove(101)+" removed");
        System.out.println(hm.containsKey(101));
        System.out.println(hm.containsValue("Aman"));
        System.out.println(hm.getOrDefault(101,"default value"));
        System.out.println(hm.getClass());
        System.out.println(hm.isEmpty());
        System.out.println(hm.size());
        //hm.clear();
        System.out.println(hm.size());
        System.out.println(hm);
        System.out.println(hm.values());
        System.out.println(hm.keySet());
        Set s=hm.entrySet();
        System.out.println(s);
        Iterator itr=s.iterator();
        while(itr.hasNext()){
            Map.Entry m1=(Map.Entry)itr.next();
            System.out.println(m1.getKey());
            System.out.println(m1.getValue());
        }

        Map m=Collections.synchronizedMap(hm);
        System.out.println(m);



    }
}
