package ScalerProblems.PeoblemSolving3;

import java.util.*;

public class ConstructAnArray {
    public static void main(String[] args) {
//        int a[]={10,20,30,40,50};
//        ArrayList al =new ArrayList<Integer>();
//      for(int i:a){
//          al.add(i);
//      }

     // System.out.println(solve(5,20,50));
        System.out.printf(factors(30).toString());
    }

    public static ArrayList factors(int i){
        ArrayList factorslist=new ArrayList<>();
        for(int j=1;j<i;j++) {
            if (i% j == 0)
                factorslist.add(j);
        }

        return factorslist;
    }
    public static ArrayList<Integer> solve(final int A, final int B, final int C) {
        ArrayList<Integer> al=new ArrayList<Integer>(A);
        int diff=C-B;
        int element=C;
        ArrayList ds=factors(diff);
        for(int i=1;i<=ds.size();i++){

            for(int j=1;j<=A;j++){
                element=element-i;
                al.add(element);
            }
        }



        return al;
    }



}
