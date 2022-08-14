package ScalerProblems;

public class AntiDiagonalMatrixPrint {


    public static void main(String[] args) {

        int m=4,n=4;
         int row1=0;
        int A[][] = {

                {1, 2, 4,10},
                {3, 5, 7,11},
                {6, 8, 9,12},
                {6, 8, 9,12}


        };
        int arr[][]=new int [2*m-1][n];


        for(int j=0;j<n;j++){
            int row=0;
            int col=j;
            int col1=0;
            while(row<=j && col>=0){

                System.out.println(A[row][col]);
                arr[row1][col1]=A[row][col];
                col1++;
                row++;
                col--;

            }
            row1++;
        }

        for(int i=1;i<m;i++){
            int row=i;
            int col=n-1;
            int col1=0;

            while(row<n && col>=0){
                System.out.println(A[row][col]);
                arr[row1][col1]=A[row][col];
                col1++;
                row++;
                col--;

            }
            row1++;

        }

        for(int i=0;i<2*m-1;i++)
        {
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }


    }

}
