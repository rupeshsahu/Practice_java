import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class String_experiment {

    public static void main(String[] args) throws IOException, InterruptedException {
      /*  String path = "\\\\incifs1\\infastore\\10.5.4\\RC2ShippingFiles\\Platform\\informatica_1054_client_winem-64t.zip";
        String[]arr=path.split("\\");
*/

       /* boolean flag= false;

        if(flag){
            System.out.println("in if block");
        }
        else if(true){
            System.out.println("in elseif block");
        }
        else {
            System.out.println("in  else block");

        }*/

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
