package ScalerProblems.HashMapProblems;

import org.example.A;

import java.util.*;

public class GroupOfAnagrams {
    public static void main(String[] args) {

        System.out.println(isAnagram("cat","cta"));
        ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
        ArrayList<String> a=new ArrayList<>();
        a.add("abcd");
        a.add("dcba");
        a.add("dcba");
        a.add("abcd");
        a.add("abcd");
        a.add("adbc");
        a.add("dabc");
        a.add("adcb");
        Map<String,ArrayList> hm=new HashMap<>();

        for(int i=0;i<a.size();i++){

            String word=a.get(i);
            char letters[]=word.toCharArray();
            Arrays.sort(letters);
            String newWord= new String(letters);

            if(hm.containsKey(newWord)){

                hm.get(newWord).add(i+1);


            }
            else{

                ArrayList<Integer> words=new ArrayList<>();
                words.add(i+1);
                hm.put(newWord,words);
                al.add(words);


            }

        }
        System.out.println(hm);
        System.out.println(al);




    }

    public static boolean isAnagram(String str1,String str2){

        if(str1.length()!=str2.length())
            return  false;
        char temp1[]=str1.toCharArray();
        Arrays.sort(temp1);
        char temp2[]=str2.toCharArray();
        Arrays.sort(temp2);


        if(new String(temp1).equals(new String(temp2)))
            return true;
        else
            return false;

        }
    }


