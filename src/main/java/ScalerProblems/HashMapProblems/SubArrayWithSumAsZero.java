package ScalerProblems.HashMapProblems;


import java.util.*;

public class SubArrayWithSumAsZero {
    public static void main(String[] args) {

        Integer arr[]={5, 17, -22, 11};

        List<Integer> l = new ArrayList<>(Arrays.asList(arr));
        System.out.println(solve(l));

    }


    public static int solve(List<Integer> A) {
        long sum = 0;
        Map<Long, Integer> hm = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            sum = sum + A.get(i);
            if (hm.containsKey(sum) || hm.containsKey(0) || A.get(i)==0 || sum==0) {
                return 1;
            } else hm.put(sum, i);
            //A.set(i,sum);

        }

        if(sum==0)
            return 1;

        return 0;


    }
}



