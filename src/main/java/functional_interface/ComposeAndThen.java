package functional_interface;

import java.util.function.Function;

public class ComposeAndThen {
    public static void main(String[] args) {
        Function<Integer,Integer> f= i->i*2;
        Function<Integer,Integer> f1= i->i*i*i;

        System.out.println(f1.andThen(f).compose(f).andThen(f1).apply(2));
        System.out.println();

    }
}
