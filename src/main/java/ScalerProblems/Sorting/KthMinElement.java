package ScalerProblems.Sorting;

import java.util.*;

public class KthMinElement {
    public static void main(String[] args) {
        Integer a[]={ 47};

        List<Integer>ls=new ArrayList<>(Arrays.asList(a));
        System.out.println(kthElement(ls,2));




    }

    public static int kthElement(List<Integer> A, int k){

        Collections.sort(A);
        int count=0;
        int num=0;
if(A.size()<=2){
    if(A.get(0)<A.get(1) && k==1)
        return A.get(0);
    else return A.get(1);
}
        for(int i=0;i<A.size()-1;i++){

//            if(A.get(i)==A.get(i+1))
//                continue;

            if(A.get(i+1)>=A.get(i))
                count++;

            if(count==k)
                num=A.get(i);


        }
        return num;





    }

}
