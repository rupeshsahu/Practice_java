package ScalerProblems.ProblemSolving4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class frequecyarray {


    public static void main(String[] args) {
        int A[]={3,3,4,2,4,4,2,4,4};
        ArrayList al=new ArrayList<>();
        for(int i:A){
            al.add(i);
        }

        System.out.println(frequencyArray(A));
    }

    public static Map frequencyArray(int a[]){


        int arr[]=new int[10];
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();

        for(int i=0;i<a.length;i++) {
            if (hm.containsKey(a[i])){
                int count=hm.get(a[i]);
                hm.put(a[i],++count);
            }
            else{
                hm.put(a[i],1);
            }

        }


        return hm;


    }


}
