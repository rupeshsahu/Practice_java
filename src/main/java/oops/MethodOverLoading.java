package oops;

import java.security.spec.RSAOtherPrimeInfo;

public class MethodOverLoading {

    public static void m1(){
        System.out.println("  dasd");

    }
    public static void m1(int a){
        System.out.println("  int atg");

    }
    public static void m1(float a){
        System.out.println("  float atg");

    }

    public static void m1(int a,String s){
        System.out.println("  dasd");

    }
    public static void m1(String x,int b){
        System.out.println("  dasd");

    }

    public static void m1 (Object o){
        System.out.println("object version");

    }
    public static void m1(String str){
        System.out.println("Sting version");

    }
    public static void m1 (StringBuffer sb){
        System.out.println("Stringbuffer version ");
    }

    public static void main(String[] args) {
        m1('a'); //automatic promotion in java overloading char->int->long->float->double | byte->int
        //m1(null); reference to m1( ) is ambiguous

    }

}
