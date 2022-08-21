package ExceptionHandlingPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {


    public static void main(String[] args) throws IOException {
       /* FileReader fr1=new FileReader("c:\\abc.txt"); FileInputStream fi1=new FileInputStream("c:\\abc.txt")
                try(fr1;fi1)
                {

                }
                this allows in java 1.9 version*/


        try (FileReader fr = new FileReader("c:\\abc.txt"); FileInputStream fi = new FileInputStream("c:\\abc.txt"))//these resources should be autoclosable
        //means these resource classes should implements autoclosable interface
        // referece variable of resource class should be final implicitly.
        //

        {

///here write code

        }
    }
}
