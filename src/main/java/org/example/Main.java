package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void printjob(Object obj){
        System.out.println(obj);
    }

    public static void printjob(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {

    /*    Map map=new HashMap<Integer,String>();
        map.put(null,"Rupesh");
        map.put(null,"Rupesh1");
        map.put(null,"Rupesh12");
        System.out.println(map);
        System.out.println(map.size());*/

/*
        A b= new B();
        System.out.println(b.test);
        b.print("Rupeshhh");
*/
        printjob(new A());

        String str=new String("ABC");
        String str1="ABC";
        String str2= new String("ABCD");
        String s="ABC";

        System.out.println(str==str1);
        System.out.println(str==s);
        System.out.println(str.equals(str2));
        System.out.println(str.equals(str1));

        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());









    }
}