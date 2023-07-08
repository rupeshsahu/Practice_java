package ScalerProblems.ProblemSolving5;

public class CountSetBits {
    public static void main(String[] args) {
        System.out.println(numberOfSetBits(122));


    }

    public static int numberOfSetBits(int A){
        int count=0;
        while(A>0){
            if((A&1)==1){
                count++;
            }
            A=A>>1;

        }
return  count;
    }
}
