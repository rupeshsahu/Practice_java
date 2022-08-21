package ScalerProblems.HashMapProblems;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElementOfTwoArrays {


    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        int a[]={3,2,10,7,5,15,2};
        int b[]={3,3,3};
        //intersection of both arrays is{7,10,2}
        HashMap<Integer, Integer>hm =new HashMap<Integer, Integer>();

        for(int i:a){
            if(hm.containsKey(i)){
                int of=hm.get(i);
                int nf=of+1;
                hm.put(i,nf);
            }
            else{
                hm.put(i,1);
            }
        }


        for(int i:b){
            if(hm.containsKey(i) && hm.get(i)>0){
                int of=hm.get(i);
                int nf=of-1;
                hm.put(i,nf);
                al.add(i);
            }
        }

        System.out.println(al);



    }
}
