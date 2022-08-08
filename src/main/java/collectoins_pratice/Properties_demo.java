package collectoins_pratice;

import javax.sound.midi.Soundbank;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_demo {
    public static void main(String[] args) throws IOException {
        Properties p =new Properties();
        FileInputStream fis=new FileInputStream("C:\\Users\\rusahu\\OneDrive - Informatica\\Documents\\Java_practice_intelij\\Practice_java\\src\\main\\java\\collectoins_pratice\\user_passwords.properties");
        p.load(fis);
        System.out.println(p);
        System.out.println(p.getProperty("rupesh"));
        System.out.println(p.getProperty("puneet"));
        FileOutputStream fos=new FileOutputStream("C:\\Users\\rusahu\\OneDrive - Informatica\\Documents\\Java_practice_intelij\\Practice_java\\src\\main\\java\\collectoins_pratice\\user_passwords.properties");
        p.setProperty("aman","Aman@00");
        p.store(fos,"adding aman");
        p.setProperty("abc","abc");
        p.store(fos,"adding abc");




    }
}
