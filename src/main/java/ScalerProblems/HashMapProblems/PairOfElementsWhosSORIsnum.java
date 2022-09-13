package ScalerProblems.HashMapProblems;

import java.util.*;

public class PairOfElementsWhosSORIsnum {


    public static void main(String[] args) {
        int a[] = {3, 6, 8, 10, 15, 50};
        int num = 5;
        Map hm=new HashMap<>();
        int count=0;
        //System.out.println( 6^5);
       for(int i=0;i<a.length;i++)
       {
            if(hm.containsKey(a[i]^num))
            {
                count++;
            }
            else hm.put(a[i],null);
        }
        System.out.println(count);










    }

}
