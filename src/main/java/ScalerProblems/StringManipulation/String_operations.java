package ScalerProblems.StringManipulation;
import java.util.*;

public class String_operations {

    public static void main(String[] args) {
        System.out.println(String_operation("lLdfRVCgbkND"));

    }

    public static String String_operation(String str) {
        String res = str+str;
        //res = res + str;
        StringBuilder sb = new StringBuilder(res);
        sb.setLength(sb.length());


        for (int i = 0; i < sb.length(); i++) {

            if (sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u') {
                sb.setCharAt(i,'#');
            }

//


        }

        for(int i=sb.length()-1;i>=0;i--)
            if(sb.charAt(i) >= 65 &&sb.charAt(i) <= 90)
                sb.deleteCharAt(i);








return new String(sb);
    }
}
