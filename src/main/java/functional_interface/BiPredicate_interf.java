package functional_interface;

import java.util.function.BiPredicate;

public class BiPredicate_interf {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> bp=(a,b)->(a+b)%2!=0;

        System.out.println(bp.test(7,54));
    }
}
