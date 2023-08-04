package oops.Overriding;

import java.io.IOException;

public class BaseClass {
    static int x=10;
    public  void m1() throws IOException {
         System.out.println("base class method m1");

        System.out.println("Base class "+x);

    }
}
