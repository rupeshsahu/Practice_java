package ScalerProblems;

public class MaxOneInMatrix {

    public static void main(String[] args) {
        int A[][]={{0,1,1,1,1},
                {0,1,1,1,1},
                {0,0,0,0,1},
                {0,0,0,0,1},
                {1,1,1,1,1,1}
        };

int c,r,max_row_index=0;
        for(c=0;c<5;c++) {
            if (A[0][c] == 1) {
                break;
            }
        }
            for(r=1;r<5;r++){
                if(A[r][c]==0)
                    continue;

                else
                {
                    while(c>0 && A[r][c-1]==1)
                    {
                      c--;
                        max_row_index=r;

                    }

                }
            }
        System.out.println(max_row_index);


    }
}
