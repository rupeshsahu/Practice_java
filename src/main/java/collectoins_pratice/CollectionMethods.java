package collectoins_pratice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionMethods {
    public static void main(String[] args) {


        //retainall start
        Integer a[]={1,2,3,4,5,6};
        Integer b[]={1,2,3,4,5,6,7,8,9,10};
        List<Integer> list1= Stream.of(a).collect(Collectors.toList());
        List<Integer> list2=Stream.of(b).collect(Collectors.toList());
        list2.retainAll(list1);
        System.out.println(list1);
        System.out.println(list2);
        //retain all end


        System.out.println(list2.containsAll(list1));


        Stream.of(a).forEach(System.out::println);




    }
}
