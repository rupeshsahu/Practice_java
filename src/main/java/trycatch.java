public class trycatch  {


    public static void main(String[] args) throws Exception {



        try (X x = new X()){
            System.out.println("try");
            new NullPointerException();
        } finally {
            System.out.println("finally");
        }


    }



}

class X implements AutoCloseable{

    public void close() throws Exception{


    }

}
