package ScalerProblems.PeoblemSolving3;

import java.util.ArrayList;
import java.util.Collections;

public class MinDifferenceSubArray {



    public static void main(String[] args) {

        int a[]={ 66, 23, 687, 252, 187, 114, 789, 527, 129, 474, 679, 119, 687,
                92, 578, 332, 781, 499, 597, 370, 848, 248, 496, 641, 714, 572,
                399, 187, 910, 638, 100, 975, 660, 786, 227, 198, 252, 367, 725};
        ArrayList al =new ArrayList<Integer>();
        for(int i:a){
            al.add(i);
        }
        System.out.println(solve(al,29));
    }
            public static int solve(ArrayList<Integer> A, int B) {

                 Collections.sort(A);
                ArrayList<Integer> al=new ArrayList<Integer>(B);
                int min=0;
                int max=0;
                int result=Integer.MAX_VALUE;
                for(int i=0;i<=A.size()-B;i++){

//                        min=Math.min(min,A.get(j));
//                        max=Math.max(max,A.get(j));
                        min=A.get(i);
                        max=A.get(i+B-1);
                    result=Math.min(result,max-min);


                }
                return result;




        }
    }


