package ScalerProblems.PeoblemSolving3;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int result[]=solve(3,10,39);
        for(int i:result){
            System.out.println(i);
        }
    }
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY

    public static ArrayList factors(int i){
        ArrayList<Integer> factorslist=new ArrayList<>();
        for(int j=1;j<i;j++) {
            if (i% j == 0)
                factorslist.add(j);
        }

        return factorslist;
    }
    public static int[] solve(final int A, final int B, final int C) {
        int[] ans = new int[A];

        for(int i = 0; i < A; i++){
            ans[i] = Integer.MAX_VALUE;
        }
        ArrayList<Integer> D=factors(C-B);

        for (int a = 1; a <= 50; a++)
        {
            for (int d = 0; d <D.size() ; d++){
                int[] temp = new int[A];

                for (int i = 0; i < A;i++){
                    temp[i] = a + i * D.get(d);
                }

                boolean fB = false;
                boolean fC = false;
                for (int i = 0; i < A;i++){
                    if(temp[i] == B)
                        fB = true;
                    else if (temp[i] == C)
                        fC = true;
                }

                if(fB == true && fC == true && temp[A - 1] < ans[A - 1]){
                    for (int i = 0; i < A;i++){
                        ans[i] = temp[i];
                    }
                }
            }
        }
        return ans;
    }
}
