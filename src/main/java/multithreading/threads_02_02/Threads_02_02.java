/*
 * This program is used to demonstrate using synchronization with threads
 */
package multithreading.threads_02_02;
   
/**
 *
 * @author MFisher
 */
public class Threads_02_02 {
    //define a class variable called counter
     static int counter = 1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        //use lambda notation for the runnable method 
        Runnable r = () -> {


            try {
                System.out.println("ID value: " + getID());
               // Thread.sleep(5000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        };
        Thread one = new Thread(r,"one");
        one.start();
        Thread two = new Thread(r,"two");
        two.start(); 
    }
    public static synchronized int getID()
    {
        return counter++;
    }  
}
