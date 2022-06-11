package LLD_basics.interfaeces;

public class MainClass implements flyable_eatable{

    public void fly(){
        System.out.println("flying");
    }
    public void eat(){
        System.out.println("eating");
    }
    public static void main(String[] args) {


        MainClass obj=new MainClass();
        obj.eat();
        obj.fly();


    }
}
