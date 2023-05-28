package oops;

public class StaticBlock {



    public static void main(String[] args) {
        System.out.println("this is main method");
        StaticBlock obj =new StaticBlock();

    }
    static int x=10;
    static {
        System.out.println(x);

    }
    {
        System.out.println("non satic block");
    }
    StaticBlock(){
        System.out.println("constructor");

    }



}
