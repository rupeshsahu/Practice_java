package ScalerProblems.PeoblemSolving3;

import java.util.Arrays;

public class SmallestSubArrayWhichWeCanSort {

    public static void main(String[] args) {

        int a[]={ -146316343, 179840175, 760528516 };
        System.out.println(solve(a));



    }

    public static int solve(int[] A) {
        int result=0;
        int srtd_arr[]=new int[A.length];
        srtd_arr=A.clone();
      Arrays.sort(srtd_arr);
        int start=0,end=0;
        for(int i=0 ;i<A.length;i++) {
            if (A[i] != srtd_arr[i]) {
                start = i;
                break;
            }

        }

        for(int j=A.length-1 ;j>=0;j--)
        {

            if(A[j]!=srtd_arr[j])
            {
                end=j;
                break;
            }


        }


return end-start+1;

    }
}
