package collectoins_pratice.LIst_interface;

import java.util.Vector;
import java.util.stream.IntStream;

public class Vector_practice{
    static Vector<Integer> v=new Vector<>(10,3);


    public  static void m1(){
        System.out.println(" this is thread t1 "+Thread.currentThread().getName());
       // IntStream.range(1,10).forEach(i-> System.out.println((char)i));
        v.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {

        IntStream.range(1,11).forEach(i->v.add(i));
        System.out.println("Main Thread "+ Thread.currentThread().getName());
        v.stream().forEach(System.out::println);

        Runnable r=()->{
            System.out.println("Thread t "+ Thread.currentThread().getName());
            v.stream().forEach(System.out::println);

        };
        Vector_practice vp =new Vector_practice();
        Runnable r1=Vector_practice::m1;
        Thread t =new Thread(r);
        Thread t1=new Thread(r1);
        System.out.println("capacity of this vec tor is :"+v.capacity());
        v.add(11);
        System.out.println(v.capacity());
        t.start();
        t1.start();
        System.out.println(v.elementAt(2));
    }
}
