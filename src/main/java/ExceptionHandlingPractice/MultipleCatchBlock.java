package ExceptionHandlingPractice;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultipleCatchBlock {

    public static void main(String[] args) {

        try{
           throw new FileNotFoundException();

            /*  throw new ArithmeticException();*/

//            throw new Exception();

        }
        catch(FileNotFoundException e){

        }
        catch (ArithmeticException e){

        }
        catch(Exception e){

        }

    }

}
