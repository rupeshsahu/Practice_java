package ScalerProblems;

public class FindNnumberFromSortedMatrix {
    public static void main(String[] args) {
        int A[][]={

                {2, 8, 8, 8},
                {2, 8, 8, 8},
                {2, 8, 8, 8},

                {3, 10, 11, 12},
                {4, 13, 14, 15}

        };

       System.out.println(findNum(A,8));

       // System.out.println(A[0].length);

    }

    public static int findNum(int A[][],int num){
        int m=A.length;
        int n=A[0].length;

        int i=0,j=n-1;
        while(j>=0&&i<m)
        {
            if(A[i][j]==num) {
                int k=j;

                while(k>0){
                    if(A[i][j-1]==num)
                        j--;
                    k--;
                }

                // System.out.println(i+"  "+j);
                return (i + 1) * 1009 + (j + 1);
            }
            if(num<A[i][j])
                j--;
            else
                i++;

        }
        return -1;





        }




}
