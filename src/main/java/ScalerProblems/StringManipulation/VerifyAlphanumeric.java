package ScalerProblems.StringManipulation;

public class VerifyAlphanumeric {
    public static void main(String[] args) {
        char A[]={'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
        System.out.println(solve(A));

    }
    public static int solve(char[] A) {

        for(int i=0;i<A.length;i++){
            if(!(A[i]>=65 && A[i]<=90) &&  !(A[i]>=97 && A[i]<=122)  && !(A[i]>='0' && A[i]<='9'))
                return 0;

        }
        return 1;
    }

}
