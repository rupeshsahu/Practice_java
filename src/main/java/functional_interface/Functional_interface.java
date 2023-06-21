package functional_interface;

@FunctionalInterface
public interface Functional_interface {
     public  String m1(String str); // only one abstract method allowed in Fountional interface


    default void m2()//multi default method allowed
    {
        System.out.println("this is default method of interface");

    }
    public static void m3()// multiple static method allowed
    {
        System.out.println("this is static method of interface");

    }


}
