
package multithreading.threads_01_04;

/**
 *
 * @author MFisher
 */
public class ThreadJoinExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestJoinClass t1 = new TestJoinClass("t1");  
        TestJoinClass t2 = new TestJoinClass("t2");  
        TestJoinClass t3 = new TestJoinClass("t3");  
        t1.start();
        try{  
            t1.join();  
        }catch(Exception e){System.out.println(e);}  
        t2.start();
        //thread 3 won't start until thread 2 is complete
        t3.start();
    }
    
}
