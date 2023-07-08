package oops;

public class InstranceBlockExecution {
    int x= 10;
    { m1();
        System.out.println("first instace block");
    }
    InstranceBlockExecution(){
        System.out.println(" constructor");
    }

    public static void main(String[] args) {
        InstranceBlockExecution obj=new InstranceBlockExecution();
        System.out.println("main method");

    }
    public void m1(){
        System.out.println("m1 method with value y"+y);
    }

    {
        System.out.println("secound isntace block");
    }
    int y=20;
}
