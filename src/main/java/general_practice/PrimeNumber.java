package general_practice;

public class PrimeNumber {
    public static void main(String[] args) {

        for(int i=1;i<=10;i++){

            if(isPrime(i))
                System.out.println(i);
        }

        System.out.println(isPrime(1));

    }


    public static boolean isPrime(int n){

        if( n==2)
            return true;

        if(n==1)
            return false;

        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
