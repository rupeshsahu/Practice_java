package LLD_basics.DesignABird;

import java.util.stream.IntStream;

public class TestJava8 {

    public static void main(String[] args) {

        IntStream.rangeClosed(2,100).filter(x->IntStream.rangeClosed(2,x/2).noneMatch(y->x%y==0)).forEach(System.out::println);

    }

}
