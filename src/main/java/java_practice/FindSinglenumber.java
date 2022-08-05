package java_practice;

import java.util.Arrays;

public class FindSinglenumber {

    public static void main(String[] args) {
        //System.out.println(findSingleNumber());
        System.out.println(10<<3);

    }

    public static int findSingleNumber (){
int ans=0;
       int A[] = {1, 1, 1, 3, 3, 3, 4, 5, 5, 5};
       for(int i=0;i<A.length-2;i=i+3){

           if((A[i]^A[i+1]^A[i+2]) !=A[i])
               ans=A[i];
       }

       return ans;
    }
}
