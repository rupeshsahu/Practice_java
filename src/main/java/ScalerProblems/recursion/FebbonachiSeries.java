package ScalerProblems.recursion;

public class FebbonachiSeries {
    public static void main(String[] args) {
        System.out.println(nthFebonaccinumber(6));

    }
    public static int nthFebonaccinumber(int n){

        if(n==1)
            return 1;
        if(n==2)
         return 1;

        return(nthFebonaccinumber(n-2)+nthFebonaccinumber(n-1));
    }
}
