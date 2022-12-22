package ScalerProblems.StringManipulation;

public final class MyImmutableClass {

    public int getI() {
        return i;
    }

    private int i;
    MyImmutableClass(int i){
        this.i=i;

    }
    public MyImmutableClass modify(int i){

        if(this.i==i)
            return this;
        else
        return new MyImmutableClass(i);

    }
}
