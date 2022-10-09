package Core_java;

import javax.sound.midi.Soundbank;

public class A {
    public static void main(String[] args) {
      //  P p =new P();
      //  p.getName("parent reference parent obj");
        P p1=new C();
        p1.getName("parent reference child obj");

        C c=new C();
        c.getName("hahaha");

    }
}

abstract class P{

    public abstract String getName(String name);
//    {
//        System.out.println("parent methpd");
//        return name;
//
//    }

}
class C extends P{

    public String getName(String name){
        System.out.println("Child method");
        return name;

    }

}


