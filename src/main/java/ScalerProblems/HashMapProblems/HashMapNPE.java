package ScalerProblems.HashMapProblems;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapNPE {

    public static void main(String[] args) {
        Map m=new HashMap<>();
        m.put(11,"rupesh");
        m.put(12,"puneet");
        m.put(13,"shubham");m.put(15,"Deepanshu");
        m.put(14,"anil");

        int i=0;


            while (i <= 20) {
               // if(m.get(i)!=null)
                System.out.println( m.get(i)+ "");
                i++;
            }




    }
}
