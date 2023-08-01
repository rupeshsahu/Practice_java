package ExceptionHandlingPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class NestedTryCatch {
    public static String i="";
    public static void main(String[] args) throws Exception {
        try{
            i+="try";
            throw new Exception();

//            try{
//               i+="try";
//
//
//            }
//            catch (Exception e){
//                i+="catch";
//            }
//            finally {
//                i+="Finally";
//
//            }

        }catch(Exception e){
            i+="catch";

        }
        finally {
            i+="Finally";

        }

        System.out.println(i);

        try{

        }
        finally {

        }

        try(FileInputStream fis=new FileInputStream(" das"); FileReader fr=new FileReader("2"))

        {


        }
    }
}
