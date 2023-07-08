import java.io.IOException;

public class ProcessExperiment {

    public static void main(String[] args) throws IOException {
        Process p = Runtime.getRuntime().exec(String.valueOf(System.getenv("windir")) + "\\system32\\" + "tasklist.exe /v");
        System.out.println(p.getOutputStream());
        
        /*while(p.isAlive()){
            System.out.println("process is alive");
        }*/
        if(!p.isAlive()){
            System.out.println("process is not alive");
        }

    }
}
