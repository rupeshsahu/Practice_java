package oops.Overriding;

public class MainClass {
    public static void main(String[] args) {
        BaseClass obj1=new BaseClass();
        BaseClass obj2=new DerivedClasss();
        DerivedClasss obj3=new DerivedClasss();

        System.out.println(obj3.x);
        System.out.println(DerivedClasss.x);



    }
}
