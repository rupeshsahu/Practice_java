package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOfOrders {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        List<String> list1=new ArrayList<String>();
        list.add("rahul");
        list.add("Ram");
        list.add("aman");
        list.add("satish");
        list.add("puneet");
        list.add("Ashwani");
       // Collections.sort(list);
//       Comparator<Integer> c=(o1,o2)->(o1<o2)?-1:(o1>o2)?1:0;
//      Collections.sort(list,c);
//    //   list.stream().forEach(System.out::println);
//         list.stream().filter(i->i%2==0).collect(Collectors.toList());
      list.stream().forEach(i-> System.out.println(i));
        list1=list.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
        list1.forEach(System.out::println);

        System.out.println(list);

        System.out.println(list.stream().filter(s->s.length()<5).count());
       System.out.println( list.stream().max((s1,s2)->s1.compareTo(s2)).get());
        list.forEach(System.out::println);
       List<String>l3=list.stream().map(s->s.replace(s.charAt(2),'$')).collect(Collectors.toList());
        l3.stream().forEach(System.out::println);
        Integer i[]={1,2,4,5,3,2,3,4,2,3};
        Stream<Integer> s=Stream.of(i);
        List<Integer> arr=(List)s.sorted((o1,o2)->(o1<o2)?1:(o1>o2)?-1:0).collect(Collectors.toList());
        arr.stream().forEach(System.out::println);


    }
}

