package ScalerProblems.PeoblemSolving3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ContigiousArrayof0And1 {

    public static void main(String[] args) {

        int A[]={0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0};


        ArrayList al=new ArrayList<>();
        for(int i:A){
            al.add(i);
        }

        System.out.println(solve2(al));

    }



    public static int solve2(ArrayList<Integer> al) {

        int ans=0;
        int sum=0;

        for(int i=0;i<al.size();i++){
            if(al.get(i)==0)
                al.set(i,-1);
        }
        for(int i=0;i<al.size();i++){
            sum=sum+al.get(i);
        }
        ans=al.size()-Math.abs(sum);
        return ans;

    }

    public static int solve(int[] A) {
        int N = A.length;
        int maxLen = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < N; i++) {
            count += A[i] == 1 ? 1 : -1;
            if (map.containsKey(count)) {
                maxLen = Math.max(maxLen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxLen;

    }

}
