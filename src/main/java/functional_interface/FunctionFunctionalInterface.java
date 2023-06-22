package functional_interface;

import java.util.Random;
import java.util.function.Function;

public class FunctionFunctionalInterface {

    public static void main(String[] args) {
        Function<Integer,String> f=(i)->""+(char)i.intValue();
        System.out.println(f.apply( new Random().nextInt(128)));
    }
}
