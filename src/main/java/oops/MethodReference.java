package oops;

public class MethodReference implements interfacetest {
    public  void referecnceMathod1()
    {
        System.out.println("static method referecce1");
    }

    public void  referecnceMathod2(){
        System.out.println("static method referecce2");
    }

    public static void main(String[] args) {
        interfacetest obj1= new MethodReference()::referecnceMathod2;
        obj1.referecnceMathod1();

    }
}
