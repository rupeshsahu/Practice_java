package oops;

public class MethodReference implements interfacetest {
    public  void referecnceMathod1()
    {
        System.out.println("static method referecce");
    }

    public void  referecnceMathod2(){
        System.out.println("static method referecce");
    }

    public static void main(String[] args) {
        interfacetest obj1= new MethodReference()::referecnceMathod1;
        obj1.referecnceMathod1();

    }
}
