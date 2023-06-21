package LLD_basics.DesignABird;

public class Sparrow extends Bird implements Flyable{

            FlyingBehaviour fb;

    public Sparrow(FlyingBehaviour fb) {
        this.fb = fb;
    }
    //    Sparrow(FlyingBehaviour fb){
//        this.fb=fb;
//
//    }

    public void makeFly() {
       fb.makeFly();



    }
}
