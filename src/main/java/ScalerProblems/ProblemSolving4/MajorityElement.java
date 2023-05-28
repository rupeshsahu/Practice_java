package ScalerProblems.ProblemSolving4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {


    public static void main(String[] args) {
        int A[]={3,3,4,2,4,4,2,4,4};
        ArrayList al=new ArrayList<>();
        for(int i:A){
            al.add(i);
        }

  frequencyArray(A);
    }
    public static Map frequencyArray(int a[]){


        int arr[]=new int[10];
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int mj=0;
        for(int i=0;i<a.length;i++) {



            if (hm.containsKey(a[i])){
                int count=hm.get(a[i]);
                hm.put(a[i],++count);
                if(hm.get(a[i])!=null)
                if(hm.get(a[i])>0);
                mj=a[i];
            }

            else{
                hm.put(a[i],1);
                hm.put(mj,hm.get(mj)-1);


            }

        }


        return hm;

    
}}
