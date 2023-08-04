import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class test {


    public void display(Object o){

        System.out.println("Object");
    }
    public void display(String str){

        System.out.println("String");
    }

    public static void main(String[] args) {
        test t=new test();
        t.display(null);
        Integer a[]={1,2,3,4,2,3,4};
        List<Integer> list=new ArrayList<>();
        list= Stream.of(a).collect(Collectors.toList());
        list= Arrays.asList(a);
        System.out.println(list);
        List<Integer> randomNumberList=new ArrayList<>();
        randomNumberList=new Random().ints(10,1,10).boxed().collect(Collectors.toList());
        System.out.println(randomNumberList);
        list.stream().sorted().filter(i->i%2==0).map(i->i+5).forEach(System.out::println);






    }


}
