package ScalerProblems.Sorting;

import java.util.*;

public class IsItAP {

    public static void main(String[] args) {
        Integer arr[]={43, 43, 42, 44 };
        List<Integer> A =new ArrayList<>(Arrays.asList(arr));
        System.out.println(checkAP(A));

    }

    public static int checkAP(List<Integer> A ) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        Map <Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<A.size();i++){

            min=Math.min(A.get(i),min);
            max=Math.max(A.get(i),max);
            if(hm.containsKey(A.get(i))){
                int of=hm.get(A.get(i));
                int nf=of+1;
                hm.put(A.get(i),nf);
            }
            else{
                hm.put(A.get(i),1);
            }
        }
        int d=((max-min)/(A.size()-1));
        int a=min;

        for(int i=0;i<A.size();i++){
            int num=a+(i*d);
            if(hm.containsKey(num) && hm.get(num)==1){
                hm.remove(num);
            }
        }

        if(hm.isEmpty()){
            return 1;
        }
        else return 0;




    }


}
