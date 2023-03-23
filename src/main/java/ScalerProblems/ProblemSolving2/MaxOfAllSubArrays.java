package ScalerProblems.ProblemSolving2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxOfAllSubArrays {

    public static void main(String[] args) {

        int a[]={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        List<Integer> al1 = new ArrayList();

        for(int i:a){
            al1.add(i);
        }










//        al1.add(1);
//        al1.add(3);
//        al1.add(7);
//        al1.add(2);
//        al1.add(10);
//        al1.add(8);
//        al1.add(6);
//        al1.add(2);
//        al1.add(3);
        System.out.println(slidingMaximum(al1,2));




    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        ArrayList<Integer> al =new  ArrayList<Integer>();
        for(int i=0;i<=A.size()-B;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<=i+B-1;j++){
                max=Math.max(max,A.get(j));

            }
            al.add(max);
        }

        return al;

    }
}


