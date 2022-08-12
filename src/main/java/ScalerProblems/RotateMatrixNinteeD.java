package ScalerProblems;

public class RotateMatrixNinteeD {
    public static void main(String[] args) {
        int m=4,n=4;
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int ln=a.length;
        System.out.println(ln);

        for(int i=0;i<m;i++)
        {
            for(int j=i;j<n;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }


        int l=0,r=n-1;

        while(l<=r){

            for(int i=0;i<m;i++){
                int temp=a[i][l];
                a[i][l]=a[i][r];
                a[i][r]=temp;
            }
            l++;
            r--;
        }


            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println(" ");
            }
    }
}
