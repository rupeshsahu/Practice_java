package MapInterf;

import java.util.*;
import java.util.stream.Collectors;

public class HashMap_Practice {
    public static void main(String[] args) {
        Map<Integer,String> hm =new HashMap<>();
        Random rm= new Random();
        for(int i=1;i<10;i++){
            hm.put(i,"value"+(char)(65+i));
        }

        Set<Integer> keyset=hm.keySet();

      //keyset.stream().forEach(i-> System.out.println(hm.get(i)));
     // hm.values().stream().forEach(System.out::println);
        //System.out.println(list);
hm.put(null,"key is null and this is value");
        System.out.println(keyset);
       List<Map.Entry> list1= hm.entrySet().stream().collect(Collectors.toList());
      //  list1.get(0).setValue("replaced");
        System.out.println(hm);
        System.out.println(hm.get(list1.get(2).getKey()));
       // hm.clear();
        System.out.println(hm.getOrDefault(1,"defaultcalue").concat("RUpesh"));




       /* System.out.println(hm.put(1,"Rupesh"));
        System.out.println(hm.get(1));
        System.out.println(hm.getOrDefault(1,"this key is not available"));*/
    }
}
