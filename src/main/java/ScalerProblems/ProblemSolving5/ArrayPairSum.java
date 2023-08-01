package ScalerProblems.ProblemSolving5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayPairSum {


    public static void main(String[] args) {
        Integer arr[]={1, 2, 3, 4, 5};


        List<Integer> l=new ArrayList<>();
        l=Arrays.asList(arr);
        System.out.println(solve(l,2));


    }

    public static int solve(List<Integer> A, int B) {
        int result=0;

        for(int i=0;i<A.size();i++){
            for(int j=i+1;j<A.size();j++){
                System.out.println(A.get(i)+" "+A.get(j));
                if((A.get(i)+A.get(j))%B==0)
                    result++;


            }
        }

        return result;

    }
}
