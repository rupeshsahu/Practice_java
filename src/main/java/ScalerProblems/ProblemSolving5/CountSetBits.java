package ScalerProblems.ProblemSolving5;

public class CountSetBits {
    public static void main(String[] args) {
        System.out.println(numberOfSetBits(122));
        System.out.println(2 &1);
 int i=0;
        while((1<<i)<40){
            System.out.println(1<<i);
        }


    }

    public static int numberOfSetBits(int A){
        int count=0;
        while(A>0){
            if((A&1)==1){
                count++;
            }
           // System.out.println(A);
            A=A>>1;

        }
return  count;
    }
}
