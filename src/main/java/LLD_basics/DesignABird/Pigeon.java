package LLD_basics.DesignABird;

public class Pigeon extends Bird implements Flyable{

    FlyingBehaviour fb;
    public Pigeon(FlyingBehaviour fb) {
        this.fb=fb;


    }

    @Override
    public void makeFly() {
       // FlyingBehaviour fb =new PigonEagelFly();
        fb.makeFly();

    }
}
