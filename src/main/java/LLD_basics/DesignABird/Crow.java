package LLD_basics.DesignABird;

public class Crow extends Bird implements Flyable{

    FlyingBehaviour fb;
    Crow(FlyingBehaviour fb){
        this.fb=fb;
    }
    @Override
    public void makeFly() {

        fb.flyCrowSparrow();

    }
}
