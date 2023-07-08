package ScalerProblems.ProblemSolving5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequecyOfChar {
    public static void main(String[] args) {
        String str1="a";
        ArrayList<Integer> charFrequencyList=new ArrayList<>();
        for(int i=0;i<26;i++){
            charFrequencyList.add(i,0);
        }
        for(int i=0;i<str1.length();i++){

            charFrequencyList.set(str1.charAt(i)-'a', charFrequencyList.get(str1.charAt(i)-'a')+1);
        }
        System.out.println(charFrequencyList);
/*
        int a[]=new int[26];
        for(int i=0;i<str1.length();i++){
            a[str1.charAt(i)-'a']++;

        }
        for(int i=0;i<26;i++){
            System.out.println((char)(i+'a')+"'s frquency is-  "+a[i]);
        }
       Arrays.stream(a).forEach(System.out::println);*/

    }


}
