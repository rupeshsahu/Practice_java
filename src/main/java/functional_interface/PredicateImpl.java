package functional_interface;

import java.util.function.Predicate;

public class PredicateImpl {
    public static void main(String[] args) {
        int i=11 ;
        Predicate<Integer> p=(j)-> {return j<10;};
        System.out.println(p.test(i));
    }
}
