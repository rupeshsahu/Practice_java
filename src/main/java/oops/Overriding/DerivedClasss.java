package oops.Overriding;

import java.io.FileNotFoundException;
import java.io.IOException;

public class DerivedClasss extends BaseClass{

    static int x=20;
    public void m1() throws RuntimeException {
         System.out.println("derived class method m1");

         System.out.println("Base class "+x);

    }
}
