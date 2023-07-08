package ScalerProblems.PeoblemSolving3;

import java.util.ArrayList;
import java.util.Collections;

public class OptimalPartitioning {

    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        //al.add(2);
        al.add(1);
        al.add(3);
        al.add(2);
        al.add(4);
        al.add(6);
        System.out.println(solve(al));

    }

    public static int solve(ArrayList<Integer> A) {
int min=Integer.MAX_VALUE;
        Collections.sort(A);
        for(int i=0;i<A.size()-1;i++){
            min=Math.min(min,A.get(i+1)-A.get(i));
        }
        return min;


    }
}
