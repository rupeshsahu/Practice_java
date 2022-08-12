package ScalerProblems;

public class FindNnumberFromSortedMatrix {
    public static void main(String[] args) {
        int A[][]={

                {1, 3, 5, 7},
                {2, 4, 6, 8}

        };

       System.out.println(findNum(A,7));

       // System.out.println(A[0].length);

    }

    public static int findNum(int A[][],int num){
        int m=A.length;
        int n=A[0].length;
        int i=0,j=n-1;
        while(i<n&&j>=0)
        {
            if(A[i][j]==num)
                return i*1009+j;
            if(A[i][j]>num)
                j--;
            else
                i++;

        }
        return -1;





        }




}
