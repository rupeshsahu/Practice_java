package ScalerProblems.ProblemSolving1;

public class ContinuousSumQuery {
    public static void main(String[] args) {

        int arr[][]={{1, 2, 10}, {2, 3, 20}, {2, 4, 25}};
        solve(5,arr);


    }

    public static int[] solve(int A, int[][] B) {
        int beggers_pots[]=new int[A];
        for(int i=0;i<B.length;i++)
        {

                beggers_pots[B[i][0]-1]=B[i][2];
            beggers_pots[B[i][1]]=-B[i][2];


            }

        for(int j=1;j<beggers_pots.length;j++)
            beggers_pots[j]=beggers_pots[j-1]+beggers_pots[j];



//[10, 55, 45, 25, 25]


            return beggers_pots;
    }


}
