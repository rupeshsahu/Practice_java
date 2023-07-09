package ProcessBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestProcessBuilder {

    public static void main(String[] args) throws IOException {

        ProcessBuilder pb =new ProcessBuilder("cmd.exe","/c","dir");
        StreamGobbler streamGobbler1=new StreamGobbler(pb.start().getInputStream());
                Thread thread=new Thread(streamGobbler1.r);
        thread.start();



StringBuffer sb=new StringBuffer();
        BufferedReader bf=new BufferedReader(new InputStreamReader(pb.start().getInputStream()));
        String line = null;
       {

           // System.out.println(line);
            sb.append(line);
        }
        StreamGobbler output=new StreamGobbler(pb.start().getInputStream());
        System.out.println(sb);



    }
}
