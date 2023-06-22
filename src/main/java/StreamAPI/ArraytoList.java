package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraytoList {
    public static void main(String[] args) {
        Integer a[]={2,4,3,5,7,3,4,7,3,1,3,5,6};
        List<Integer> list= Stream.of(a).collect(Collectors.toList());
        System.out.println(list);
        List<Boolean>list1=list.stream().map(i->i<5).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list1);

    }
}
