package LLD_basics.creationalDesigns.Singleton;

public class MainClass {

    public static void main(String[] args)
    {

        DataBaseV1 db = DataBaseV1.getInstance();
        DataBaseV1 db1 = DataBaseV1.getInstance();
    }
}
