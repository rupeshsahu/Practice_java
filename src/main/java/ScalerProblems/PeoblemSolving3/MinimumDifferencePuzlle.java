package ScalerProblems.PeoblemSolving3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumDifferencePuzlle {
    public static void main(String[] args) {

        int arr[]={66, 23, 687, 252, 187, 114, 789, 527, 129, 474, 679, 119, 687,
                92, 578, 332, 781, 499,
                597, 370, 848, 248, 496, 641,
                714, 572, 399, 187, 910, 638, 100, 975,
                660, 786, 227, 198, 252, 367, 725};
       List<Integer> al=new ArrayList<Integer>();
       for(int i:arr){
           al.add(i);
       }


        System.out.println(solve(al,29));
    }

    public static int solve(List<Integer> A, int B) {

        Collections.sort(A);
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int result=Integer.MAX_VALUE;
        for(int i=0;i<=A.size()-B;i++){
            for(int j=i;j<B;j++){
                min=Math.min(min,A.get(j));
                max=Math.max(max,A.get(j));
            }
            result=Math.min(result,max-min);


        }
        return result;



    }
}
