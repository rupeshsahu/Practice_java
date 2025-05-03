package MehtodHidingOverriding;

public class MainClass {
    public static void main(String[] args) {
        SubClass sc = new SubClass();
        SuperClass sc1 = new SuperClass();
        SuperClass sc2 = new SubClass();

        sc.m1();
        sc1.m1();
        sc2.m1();

        //Method overriding
//        SubClass.m1
//        SubClass.m1...
//        SuperClass.m1
//        SubClass.m1
//        SubClass.m1...

//        Method Hiding

//        SubClass.m1
//        SubClass.m1...
//        SuperClass.m1
//        SuperClass.m1



    }
}
