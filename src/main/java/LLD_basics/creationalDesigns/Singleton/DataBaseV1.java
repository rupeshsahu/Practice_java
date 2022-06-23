package LLD_basics.creationalDesigns.Singleton;

public class DataBaseV1 {
    private static DataBaseV1 instance=null;
    private DataBaseV1(){}
    public static DataBaseV1 getInstance(){
        if (instance==null)
            // azy initilization
        instance =new DataBaseV1();
        return instance;
    }
}
