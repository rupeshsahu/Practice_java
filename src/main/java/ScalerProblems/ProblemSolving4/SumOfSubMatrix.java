package ScalerProblems.ProblemSolving4;

public class SumOfSubMatrix {

    public static void main(String[] args) {
        int[][] a =new int[4][4];
        int number=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                a[i][j]=++number;
            }
        }
        System.out.println("Sum of given matrix is :-  "+sumOfMatrix(a,1 ,1,2,2));
    }
    public static int sumOfMatrix(int[][] a, int i, int j, int p, int q){
        printMatrix(a);
        preSumMatix(a);
        printMatrix(a);
        int sum=0;
        int sum1=0,sum2=0,sum3=0;
        int p1=p;
        int remainingsum=0;
         sum1=a[p][q];
        if(i!=0 && j!=0){
        while(p>=i ){
            --p;
        }
         sum2=a[p][q];
        while(q>=j){
            --q;
        }
         sum3=a[p1][q];
            --i;
            --j;

             remainingsum=a[i][j];
        }
        sum=sum1-sum2-sum3+remainingsum;
;        return sum;
    }

    public static void printMatrix(int[][] arr){
        System.out.println();
        for(int b=0;b<arr.length;b++){
            for(int c=0;c<arr.length;c++){
                System.out.print(arr[b][c]+"    ");
            }
             System.out.println();
        }
    }
    public static void preSumMatix(int[][] a){
        for(int b=0;b<a.length;b++) {
            int sum = 0;
            for (int c = 0; c < a.length; c++) {
                sum = sum + a[b][c];
                a[b][c] = sum;
            }
        }
        for(int b=0;b<a.length;b++){
            int sum=0;
            for(int c=0;c<a.length;c++){
                sum=sum+a[c][b];
                a[c][b]=sum;
            }
        }
    }
}
