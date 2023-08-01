package ScalerProblems.ProblemSolving5;

import java.util.ArrayList;
import java.util.List;

public class StringSuffeling {
    public static void main(String[] args) {
        String str="aabgs";
        int A[]={3,1,2,4,0};
        char a[]=new char[str.length()];

        for(int i=0;i<str.length();i++){
            a[A[i]]=str.charAt(i);
        }
        System.out.println(String.valueOf(a));

    }
}
