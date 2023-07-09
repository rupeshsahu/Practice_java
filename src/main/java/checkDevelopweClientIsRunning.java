

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
//import java.util.logging.Logger;


public class checkDevelopweClientIsRunning {
    public static int incrVal = 0;
    public static int icount = 0;

    public static void main(String[] args) throws IOException, InterruptedException {
        Process p = Runtime.getRuntime().exec(String.valueOf(System.getenv("windir")) + "\\system32\\" + "tasklist.exe /v");
        System.out.println("created process");
        Thread.sleep(10000L);
        System.out.println("sleep done");
        InputStream errorStream = p.getErrorStream();
        //Thread.sleep(10000);
        System.out.println(errorStream.available());
        errorStream.close();
        InputStream inputStream = p.getInputStream();
        if (inputStream.available() > 0) {
            BufferedInputStream bufInput = new BufferedInputStream(p.getInputStream());
            byte[] byteArr = new byte[1024];
            int length = 0;
            String line;
            StringBuffer strInputBuf = new StringBuffer();
            while ((length = bufInput.read(byteArr, 0, byteArr.length)) != -1)
                strInputBuf.append(new String(byteArr, 0, length));
            if (strInputBuf.indexOf("Informatica Developer") < 0) {
                System.out.println("Process of Informatica Developer is not running.");
                // notfound = true;
            } else {
                System.out.println("Informatica Developer is still running.");
                //  notfound = false;
                //  incrVal = 2;
            }
        }







    }



}
