package ScalerProblems.BasicMath;

public class NumbersOfFactors {
    public static void main(String[] args) {
        System.out.println(howManyFactors(16));

    }

    public static int  howManyFactors(int n){

        int ans=0;

        for(int i=1;i<=n;i++){

            if(n%i==0)
                ans++;
        }


        return ans;
    }
}
