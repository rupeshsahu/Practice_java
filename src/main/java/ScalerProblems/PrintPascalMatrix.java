package ScalerProblems;

public class PrintPascalMatrix {


    public static void main(String[] args) {
        int l=5;
        int print[][]=new int[l][l];
         print=PascalMatix(l);
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                System.out.print(print[i][j]+" ");
            }
            System.out.println();
        }

    }


    public static int[][] PascalMatix(int num){

        int res[][]=new int[num][num];
         if(num==0){
             res[0][0]=0;
         }
        for(int m=0;m<num;m++){
            for(int n=0;n<=m;n++){
                if(n==0 || n==m){
                    res[m][n]=1;
                }else
                res[m][n]=res[m-1][n]+res[m-1][n-1];
            }
        }

return res;




    }
}
