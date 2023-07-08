package ScalerProblems.ProblemSolving5;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {
    public static void main(String[] args) {
        String str1="abc";
        int count=0;
        String str2="abcbaccabc";
        List <Integer>str1Frequecy=frequenctArray(str1);
        List <Integer>str2PermutationFrequency1=frequenctArray(str2.substring(0,str1.length()));
        if(str1Frequecy.equals(str2PermutationFrequency1)){
            count++;
        }
        int l=0,r=str1.length(),m=str2.length();
  while(r<m){
      if(str1Frequecy.equals(str2PermutationFrequency1)){
          count++;
      }

      str2PermutationFrequency1.set(str2.charAt(l)-'a',str2PermutationFrequency1.get(str2.charAt(l)-'a')-1);
      str2PermutationFrequency1.set(str2.charAt(r)-'a',str2PermutationFrequency1.get(str2.charAt(r)-'a')+1);

      l++;
      r++;



  }

       /* for(int i=0;i<str2.length()-2;i++){

           // List str2PermutationFrequency=frequenctArray(str2Permustaions);
            if(str1Frequecy.equals(str2PermutationFrequency1)){
                count++;
            }
            String str2Permustaions=str2.substring(i,i+3);

        }*/
        System.out.println("Number of "+str1+" permutations in "+str2+" is "+count);


    }


    public static List frequenctArray(String str1 ) {
//        String str1="aquickbrownfoxjumpsoverthelittlelazydog";
        ArrayList<Integer> charFrequencyList=new ArrayList<>();
        for(int i=0;i<26;i++){
            charFrequencyList.add(i,0);
        }
        for(int i=0;i<str1.length();i++){

            charFrequencyList.set(str1.charAt(i)-'a', charFrequencyList.get(str1.charAt(i)-'a')+1);
        }

/*
        int a[]=new int[26];
        for(int i=0;i<str1.length();i++){
            a[str1.charAt(i)-'a']++;

        }
        for(int i=0;i<26;i++){
            System.out.println((char)(i+'a')+"'s frquency is-  "+a[i]);
        }
       Arrays.stream(a).forEach(System.out::println);*/
        return charFrequencyList;

    }

}
