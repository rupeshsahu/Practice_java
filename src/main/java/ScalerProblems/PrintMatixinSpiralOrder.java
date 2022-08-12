package ScalerProblems;

public class PrintMatixinSpiralOrder {

    public static void main(String[] args) {
        int m=4,n=4;
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
      /*  Matrix:-
        1   2   3   4
        5   6   7   8
        9   10  11  12
        13  14  15  16

        output:-1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10*/

        int l=0,r=m-1,t=0,b=n-1;

        while(l<=r && t<=b)
        {
            for (int i=t;i<=r;i++){
                System.out.print(a[l][i]+" ");
            }
            t++;
            for(int j=t;j<=b;j++){
                System.out.print(a[j][b]+" ");
            }
            r--;
            for(int k=r;k>=l;k--){
                System.out.print(a[b][k]+" ");
            }
            b--;
            for(int p=b;p>=t;p--){
                System.out.print(a[p][l]+" ");
            }
            l++;

        }

    }
}
