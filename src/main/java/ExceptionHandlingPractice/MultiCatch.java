package ExceptionHandlingPractice;

import java.io.IOException;

public class MultiCatch {
    public static void main(String[] args) {

        try{
            throw new IOException();


        }catch (NullPointerException  | ArithmeticException | ArrayIndexOutOfBoundsException | ClassCastException e){

        }
        catch (RuntimeException | IOException  /*| ReflectiveOperationException |CloneNotSupportedException |InterruptedException*/ e){

        }
    }
}
