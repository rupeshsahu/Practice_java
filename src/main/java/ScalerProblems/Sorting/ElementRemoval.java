package ScalerProblems.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ElementRemoval {

    public static void main(String[] args) {

        Integer a[]={1,2,5,3,8};
        List<Integer> l=new ArrayList<>(Arrays.asList(a));
        System.out.println(removal(l));

    }

    public static int removal(List<Integer> A){
        int sum=0;

        Collections.sort(A);
        while(A.size()>0){

            for(int j=0;j<A.size();j++)
            sum=sum+A.get(j);

            A.remove(A.size()-1);

        }

        return sum;
    }

}
