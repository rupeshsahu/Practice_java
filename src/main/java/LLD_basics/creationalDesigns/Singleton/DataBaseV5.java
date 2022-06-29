package LLD_basics.creationalDesigns.Singleton;
//via Enum

public class DataBaseV5 {
    private static DataBaseV5 instance=null;
    private DataBaseV5(){}
    public static DataBaseV5 getInstance(){
        if(instance==null) {
            synchronized (DataBaseV5.class) {
                if(instance==null)
                {
                    instance=new DataBaseV5();
                }


            }
        }

        return instance;
    }
}


   /* Cass A{

        Private A(){}
        Private static A a=null;
        Public static A getInstance(){
        if(a==null){
        a= new a();
        Return a;;
        }


        }

        A a=A.getInstance();

        a=A.getInstance();*/


