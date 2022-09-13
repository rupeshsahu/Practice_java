package ScalerProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleNumber2 {
    public static void main(String[] args) {
        int a[]={1,2,3,1,8,2,3,1,2,3};

        List<Integer> A= new ArrayList<Integer>();
        for(int i=0;i<a.length;i++)
            A.add(a[i]);

        Map<Integer,Integer> m=new HashMap<>();

        for(int i=0;i<A.size();i++){
            if(m.containsKey(A.get(i))){
                int of=m.get(A.get(i));
                int nf=of+1;
                m.put(A.get(i),nf);
            }
            else{
                m.put(A.get(i),1);
            }
        }
        for(Map.Entry<Integer,Integer> val:m.entrySet()){
            if(val.getValue()==1)
                System.out.println(val.getKey());
        }




    }
}
