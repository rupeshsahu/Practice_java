package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIPractice {

    public static void main(String[] args) {

        Integer[] arr={0,10,20,18,5,15,25};
        List<Integer> list= Stream.of(arr).collect(Collectors.toList());
        filterOut();
        System.out.println(doubleNumbers(list));

        System.out.println(countNumberOfEvenNumbers(list));

    }

    public static void filterOut(){
        Integer[] arr={0,10,20,18,5,15,25};

        List<Integer> list= Stream.of(arr).collect(Collectors.toList());
        System.out.println(list);
       List<Integer> result= new ArrayList<>();
       result=list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(result);
    }
    public static List<Integer> doubleNumbers(List<Integer> input){
        return input.stream().map(i->i*2).collect(Collectors.toList());
    }


    public static long  countNumberOfEvenNumbers(List<Integer> list){
        return list.stream().filter(i->i%2==0).collect(Collectors.toList()).stream().count();   }

}
