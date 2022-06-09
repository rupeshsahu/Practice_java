package LLD_basics.AccessModifiers.pkg2;

import LLD_basics.AccessModifiers.pkg1.ClassA;

public class ClassB extends ClassA {

    public static void main(String[] args) {
        ClassB Bobj=new ClassB();
        System.out.println(Bobj.Aname+"    "+Bobj.Adom);

    }



}
