package ProcessBuilder;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamGobbler {
    InputStream is;
    StringBuffer content=new StringBuffer();
    StreamGobbler(InputStream is){
        this.is=is;

    }
    Runnable r=()->{
        BufferedReader bf=new BufferedReader(new InputStreamReader(is));
        String line;
        try {
            while ((line = bf.readLine()) != null) {

                // System.out.println(line);
                content.append(line);
            }
        }
        catch(Exception e){

        }

    };
}
