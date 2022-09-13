package ScalerProblems.Sorting;

import java.util.*;

public class UniqueElement {
    public static void main(String[] args) {
        Integer a[]={ 51, 6, 10, 8, 22, 61, 56, 48, 88, 85, 21, 98, 81, 76, 71, 68, 18, 6,
                14, 23, 72, 18, 56, 30, 97, 100, 81, 5, 99, 2, 85, 67, 46, 32, 66, 51, 76, 53,
                36, 31, 81, 56, 26, 75, 69, 54, 54, 54, 83, 41, 86, 48, 7, 32, 85, 23, 47, 23, 18, 45,
                79, 95, 73, 15, 55, 16, 66, 73, 13, 85, 14, 80, 39, 92, 66, 20, 22, 25, 34, 14, 51, 14,
                17, 10, 100, 35, 9, 83, 31, 60, 24, 37, 69, 62 };


        /*A after sorting:-
        [2, 5, 6, 6, 7, 8, 9, 10, 10, 13, 14, 14, 14,
         14, 15, 16, 17, 18, 18, 18, 20, 21, 22, 22, 23, 23, 23, 24, 25,
          26, 30, 31, 31, 32, 32, 34, 35, 36, 37, 39, 41, 45, 46, 47, 48, 48,
           51, 51, 51, 53, 54, 54, 54, 55, 56, 56, 56, 60, 61,
         62, 66, 66, 66, 67, 68, 69, 69, 71, 72, 73, 73, 75, 76, 76, 79, 80, 81,
          81, 81, 83, 83, 85, 85, 85, 85, 86, 88, 92, 95, 97, 98, 99, 100, 100]

         */
        List<Integer> A=new ArrayList<>(Arrays.asList(a));

        int count=0;
        Collections.sort(A);
        Map<Integer,Boolean> hm=new HashMap<>();
        for(int i=0;i<A.size();i++){

            if(hm.containsKey(A.get(i))){
                int num=A.get(i);

                while(hm.containsKey(num))
                {
                    num++;
                    count++;
                }
                hm.put(num,true);

            }
            else hm.put(A.get(i),false);
        }

        System.out.println(count);




    }
}
