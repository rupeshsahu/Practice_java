package LLD_basics.DesignABird;

public class Eagel extends Bird implements Flyable{



    FlyingBehaviour fb;

    public Eagel(FlyingBehaviour fb) {
        this.fb = fb;
    }

    @Override
    public void makeFly() {
        //FlyingBehaviour fb =new PigonEagelFly();
        fb.makeFly();

    }
}
