package ScalerProblems.HashMapProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTwoPairsOfNumWhosSumIsNum {

    public static void main(String[] args) {

        int a[]={ 4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8 };
        Map<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<a.length;i++){
           if(hm.containsKey(-3-a[i])){
               System.out.println(i+1+"  "+(hm.get((-3-a[i]))));
           }
           if(!hm.containsKey(a[i])) hm.put(a[i],i+1);

        }


    }
}
