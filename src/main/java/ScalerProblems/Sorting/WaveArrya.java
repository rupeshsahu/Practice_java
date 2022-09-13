package ScalerProblems.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WaveArrya {
    public static void main(String[] args) {
        Integer a[]={1,2,5,3,8,9};
        List<Integer> A=new ArrayList<>(Arrays.asList(a));

        Collections.sort(A);

        for(int i=0;i<A.size()-1;i=i+2){
            int temp=A.get(i);
            A.set(i,A.get(i+1));
            A.set(i+1,temp);

        }
        System.out.println(A);

    }

}
