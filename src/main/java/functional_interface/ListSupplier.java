package functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class ListSupplier {

    public static void main(String[] args) {
        Supplier<List> supply=()->{
            List<Integer> list=new ArrayList<>();
            list.add(new Random().nextInt(10));
            list.add(new Random().nextInt(100));
            list.add(new Random().nextInt(10000));
            list.add(new Random().nextInt(10000));
            list.add(new Random().nextInt(100));
            list.add(new Random().nextInt(100));
            list.add(new Random().nextInt(100));
            return list;
        };
        System.out.println(supply.get());

    }
}
