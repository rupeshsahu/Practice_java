package LLD_basics.DesignABird;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

       /* Bird sparrow=new Sparrow( new CrowSparrowFly());
        Bird eagel=new Eagel(new PigonEagelFly());
        Eagel eagel1=new Eagel(new PigonEagelFly());
        eagel1.makeFly();
        Sparrow sparrow1=(Sparrow) sparrow;
        sparrow1.makeFly();
        sparrow1.setAge(12);
        sparrow1.setColour("plain buffy-brown overall with dingy gray-brown underparts");
        sparrow1.setName("Sparrow");
        sparrow1.setWeight(30.5);
        sparrow1.setType("House Sparrow");
        sparrow1.makeSound();
        sparrow1.eat();*/
        Crow crow=new Crow(new CrowSparrowFly(),15,1.1f,"non-veg","Black","Crow");
        System.out.println(crow.getAge());
        crow.makeFly();






    }
}
