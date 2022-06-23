package LLD_basics.creationalDesigns.Singleton;
//for multi threaded env

public class DataBaseV2 {
    private static DataBaseV2 instance=null;
    private DataBaseV2(){}
    public static synchronized DataBaseV2 getInstance(){
        if (instance==null)
        instance =new DataBaseV2();
        return instance;
    }
}
