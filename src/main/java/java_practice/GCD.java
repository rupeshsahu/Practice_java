package java_practice;

public class GCD {


    public static void main(String[] args) {

        System.out.println(gcd(13312,12001));

    }

    public static int gcd(int m,int n){
        if(m%n==0){
            return n;
        }
        int r=m%n;
        m=n;
        n=r;

        return gcd(m,n);
    }
}
