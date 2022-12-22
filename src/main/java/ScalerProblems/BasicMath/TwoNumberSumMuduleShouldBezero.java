package ScalerProblems.BasicMath;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberSumMuduleShouldBezero {

    public static void main(String[] args) {

        ArrayList<Integer> al=new ArrayList<>();
            al.add(1);
        al.add(3);
        al.add(7);
        al.add(9);


        System.out.println(solve(al,6));

    }


    public static int solve(ArrayList<Integer> A, int B) {
        int result=0;
        Map<Integer,Integer> hm=new HashMap<>();
        for (int i=0;i<A.size();i++){
            A.set(i,A.get(i)%B);
        }
        for(int i=0;i<A.size();i++){

            if(!hm.containsKey(A.get(i))){
                hm.put(A.get(i),0);
            }
            hm.put(A.get(i),hm.get(A.get(i))+1);
        }
        for(int i=0;i<A.size();i++){
            if(hm.get(B-A.get(i))!=null)
                result=result+hm.get(B-A.get(i));
            if(B-A.get(i)==A.get(i))
                result--;
        }


        return result/2;

    }


}
