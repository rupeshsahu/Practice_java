package LLD_basics.creationalDesigns.Singleton;
//double check multithreaded env

public class DataBaseV4 {
    private static DataBaseV4 instance=null;
    private DataBaseV4(){}
    public static DataBaseV4 getInstance(){
        if(instance==null) {
            synchronized (DataBaseV4.class) {
                if(instance==null)
                {
                    instance=new DataBaseV4();
                }


            }
        }

        return instance;
    }
}
