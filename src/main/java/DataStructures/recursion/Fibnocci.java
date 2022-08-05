package DataStructures.recursion;

public class Fibnocci {
    public static void main(String[] args) {
        System.out.println(fibnocci1(9));

    }

    public static int fibnocci1(int n){

        if(n==0)
            return 0;
        if(n==1)
            return 1;

        return(fibnocci1(n-1)+fibnocci1(n-2));


    }
}
