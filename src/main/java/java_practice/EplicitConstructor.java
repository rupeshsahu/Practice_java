package java_practice;

public class EplicitConstructor {

    int a=10;

    public  EplicitConstructor(int i){

        a=i;
        System.out.println(a);

    }

    public  EplicitConstructor(){
        super();
        System.out.println(a);

    }

    public static void main(String[] args) {
        EplicitConstructor obj =new EplicitConstructor();
        EplicitConstructor obj1 =new EplicitConstructor(20);
    }


}
