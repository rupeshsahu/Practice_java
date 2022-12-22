package ScalerProblems.ProblemSolving1;

import java.io.FilterOutputStream;

public class FindMissingElementIntheArray {

    public static void main(String[] args) {

        int arr[]={ 1, 2, 3, 4, 5, 6 };
        System.out.println(firstMissingPositive(arr));

    }

    public static  int firstMissingPositive(int[] A) {
        if(A.length==1)
        {
            if(A[0]>0)
                return 2;
            else
                return 1;
        }

        int arr[]=new int[A.length+2];
        int ans=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }

        for(int i=0;i<A.length;i++){
            if(A[i]>0 && A[i]<A.length+2)
                arr[A[i]]=1;
        }

        for(int i=1;i<A.length+2;i++){
            if(arr[i]==0)
            {
                ans=i;
                break;
            }
        }
        return ans;

    }
}
