package LLD_basics.DesignABird;

public class Sparrow extends Bird implements Flyable{

            FlyingBehaviour fb;
    Sparrow(FlyingBehaviour fb){
        this.fb=fb;

    }
    public void makeFly() {
        this.fb.flyCrowSparrow();



    }
}
