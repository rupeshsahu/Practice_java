package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MapAndFilter {

    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list=new Random().ints(10,1,20).boxed().collect(Collectors.toList());

      //  list=list.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println(list);
       list= list.stream().map(i->i+5).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list.stream().filter(i->i>10).count());
        //list.stream().forEachOrdered(System.out::println);
        Consumer<Integer> c=i-> System.out.println(i);
        //list.stream().forEach(c);
        Integer a[]=list.stream().toArray(Integer[]::new);



    }
}
