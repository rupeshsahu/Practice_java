package ScalerProblems.PeoblemSolving3;

import java.util.ArrayList;
import java.util.Collections;

public class OptimalPartitioning {
    public static void main(String[] args) {

        int a[]={ 2, 1, 3, 2, 4, 3};
        ArrayList al =new ArrayList<Integer>();
        for(int i:a){
            al.add(i);
        }
        System.out.println(solve(al));


    }

    public static int solve(ArrayList<Integer> A) {
        {
            int min=Integer.MAX_VALUE;
            Collections.sort(A);
            for(int i=0;i<A.size()-1;i++){
                min=Math.min(min,A.get(i+1)-A.get(i));
            }
            return min;


        }

    }


}
