package ScalerProblems;

public class InsertInSpiralorderIn2DMarix {
    public static void main(String[] args) {
        int A = 80;
        int m = A;
        int n = A;
        int c = 0;
        int a[][] = new int[A][A];

        int l = 0, r = m - 1, t = 0, b = n - 1;

        while (l <= r && t <= b) {
            for (int i = t; i <= r; i++) {
                a[l][i] = ++c;
            }
            t++;
            for (int j = t; j <= b; j++) {
                a[j][b] = ++c;
            }
            r--;
            for (int k = r; k >= l; k--) {
                a[b][k] = ++c;
            }
            b--;
            for (int p = b; p >= t; p--) {
                a[p][l] = ++c;
            }
            l++;

        }
        for(int i=0;i<A;i++){
            for(int j=0;j<A;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }


    }
}
