package oops.constructor;

public class ConstructorExperimant {
   public ConstructorExperimant(){

       System.out.println("no-agr constructor");
      /* int i=0;
         i++;
       if(i==10){
           System.exit(1);
       }


     //  super();// super must be 1 st statement in constructor*/

    }

    public ConstructorExperimant( double d){
       this(10);

        System.out.println("constructor with double args");
    }

    public  ConstructorExperimant(int i){
        this();
        System.out.println("contructor with integer args");
    }

    public static void main(String[] args) {
        ConstructorExperimant obj=new ConstructorExperimant(1.5d);
    }
}
