package ScalerProblems.Maths2;

import java.util.Collections;

public class Gcd {

    public static void main(String[] args) {
       System.out.println(getGCD(18,24));

    }

    public static int getGCD(int A, int B){


        while(A>0){
            B=B%A;
           int temp=A;
           A=B;
           B=temp;
        }
        return B;
            }




}
