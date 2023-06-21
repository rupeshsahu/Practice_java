package oops.constructor.ConstructorChaining;

public class ChildClass extends ParentClass {
    ChildClass(){
     super();
    //  super(10);
        System.out.println("Child Class Constructor");
    }

    public static void main(String[] args) {
        ChildClass c=new ChildClass();
    }

}
