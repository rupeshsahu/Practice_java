package LLD_basics.creationalDesigns.Singleton;

public class DataBaseV3 {
    //1.The object will be created at the start of the program.
    //2.slowdown the startup of app.
    //this is called Eager initiization
    private static DataBaseV3 instance=new DataBaseV3();
    private DataBaseV3(){}
    public static  DataBaseV3 getInstance(){

        return instance;
    }
}
