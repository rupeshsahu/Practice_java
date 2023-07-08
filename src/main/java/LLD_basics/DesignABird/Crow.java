package LLD_basics.DesignABird;

public class Crow extends Bird implements Flyable{

    FlyingBehaviour fb;// this is called Dependency inversoin,


    Crow(FlyingBehaviour fb,int age,float weight,String type, String colour, String name){
        this.setAge(age);
        this.setName(name);
        this.setColour(colour);
        this.setType(type);
        this.setWeight(weight);
        //this is called Depedency injection
        this.fb=fb;
    }
    @Override
    public void makeFly() {

        fb.makeFly();// this is called Dependency inversoin,

    }
}
