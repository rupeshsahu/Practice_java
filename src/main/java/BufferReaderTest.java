import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new FileReader("C:\\perforce\\IDQ_Automation\\HTml\\Target_actual\\CASS_AV_MAP516.html"));
        while ( br.readLine()!=null){
          //  System.out.println(br.lines());


        }
       // System.out.println(br.lines());

    }
}
