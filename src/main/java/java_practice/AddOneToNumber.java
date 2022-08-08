package java_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class AddOneToNumber {

    public static void main(String[] args) {

    /*int A[]={1,2,3,9};
    int l=A.length-1;
    int sum=A[l]+1;
    A[l]=sum%10;
    int carry=sum/10;

    for(int i=l-1;i>=0;i--){

        int s=A[i]+carry;
        A[i]=s%10;
        carry=s/10;
    }
    int A1[]=new int[l+2];
    if (carry==1){

    }*/
        ArrayList A=new ArrayList<>();
        A.add(0);
//        A.add(0);
//        A.add(1);
//        A.add(2);

        Collections.reverse(A);
       // System.out.println(a);

        int sum=(Integer)A.get(0)+1;
        A.set(0,sum%10);
        int carry=sum/10;


        for(int i=1;i<A.size();i++){

            int s=(Integer) A.get(i)+carry;
            A.set(i,s%10);
            carry=s/10;
        }

        if(carry==1){
            A.add(1);
        }
        Collections.reverse(A);
        if((Integer) A.get(0)==0)
        {
            //Collections.reverse(a);

            while((Integer)A.get(0)==0){
                A.remove(0);
            }
        }

        System.out.println(A);



    }

}
