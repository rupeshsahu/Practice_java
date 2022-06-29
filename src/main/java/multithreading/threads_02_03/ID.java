/*
 * ID Class contains the synchronized keyword to prevent
 * multiple threads from accessing the getID() method at the same time
 */
package multithreading.threads_02_03;

/**
 *
 * @author MFisher
 */
public class ID {
   private static int counter; // initialized to 0 by default

   public static  void getID()
   {
      for(int i=0;i<5;i++)
      System.out.println(i);
   }

    
}
