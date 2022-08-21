package java_practice;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveduplicatesFromString {
    public static void main(String[] args) {
        String str="ruuppeshr";
        char ch[]=str.toCharArray();

        HashSet<Character> hs =new HashSet<Character>();

        for(char c:ch){
            hs.add(c);
        }

        String res="";
        for(char c:hs){
            res=res+c;

        }
        System.out.println(res);


    }
}
