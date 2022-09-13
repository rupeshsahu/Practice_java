package ScalerProblems.HashMapProblems;

import java.util.*;

public class ColourfulNumber {

    public static void main(String[] args) {

System.out.println(colorful(2314));


    }

    public static int colorful(int A) {

        Set<Integer> hs = new HashSet<>();
        int num = A;
        List<Integer> l = new ArrayList<>();
        while (num > 0) {
            l.add(num % 10);
            num = num / 10;
        }
        for (int i = 0; i < l.size(); i++) {
            int product = 1;
            for (int j = i; j < l.size(); j++) {

                product = product * l.get(j);
                if (!hs.add(product)) {
                    return 0;
                }
            }


        }
        return 1;
    }




    }

    /*public static int numOfDigits(int A){

        int len=0;
        int num=A;
        while(num>0)
        {

            num=num/10;
            len++;
        }
        return len;


    }*/






