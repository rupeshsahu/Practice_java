package ScalerProblems.HashMapProblems;

import java.util.*;

public class MaxContigiousSubArray {
    public static void main(String[] args) {
        Integer arr[]={4,2,5,3,1,3,6,2,9,10,11};
       /* Arrays.sort(arr);
        List<Integer> l=new ArrayList<>(Arrays.asList(arr));
        System.out.println(l);
        int maxlen=1; int res=0;
        for(int i=0;i<l.size()-1;i++){

            if(l.get(i+1)-l.get(i)==1)
                maxlen++;
            else if(l.get(i+1)-l.get(i)==0)
                continue;
            else {
                maxlen=1;
            }


            res=Math.max(res,maxlen);

        }

        System.out.println(res);

*/

        //Above is nive approach TC is o(n2)
        List<Integer> l=new ArrayList<>(Arrays.asList(arr));
        System.out.println(longestConsecutive(l));
    }

    public static  int longestConsecutive(final List<Integer> A) {
        int res=0;
        Set<Integer> hs=new HashSet<>();
        for(Integer i:A){
            hs.add(i);
        }

        for(Integer i:A){
            if(!hs.contains(i-1)){
                int currentNum=i;
                int currentCount=1;
                while(hs.contains(currentNum+1)){
                    currentNum++;
                    currentCount++;
                }
                res=Math.max(res,currentCount);
            }
        }
        return res;


    }

}
