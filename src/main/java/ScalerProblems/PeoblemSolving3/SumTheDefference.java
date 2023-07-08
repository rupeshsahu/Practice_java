package ScalerProblems.PeoblemSolving3;

import java.util.ArrayList;

public class SumTheDefference {

    public static void main(String[] args) {

        int a[]={ 3, 5, 10};
        ArrayList al =new ArrayList<Integer>();
        for(int i:a){
            al.add(i);
        }

        System.out.println(solve(al));



    }

    public static  int solve(ArrayList<Integer> A) {

        ArrayList<Integer> temp=new ArrayList<Integer>();



        for(int i=0;i<A.size();i++){
            for(int j=0;j<A.size();j++){
                for(int k=0;k<=j;k++) {
                    temp.add(k, A.get(k));

                }
                temp.clear();


            }
        }
        return 0;

    }


}
