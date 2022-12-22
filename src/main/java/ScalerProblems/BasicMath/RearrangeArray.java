package ScAerProblems.BasicMath;

import java.util.ArrayList;
import java.util.Collections;

public class RearrangeArray {

    public static void main(String[] args) {


        ArrayList<Integer> A=new ArrayList<Integer>();

        A.add(3);
        A.add(2);
        A.add(0);
        A.add(1);



        for(int i=0;i<A.size();i++){

            A.set(i,A.get(i)*A.size());



        }
        for(int i=0;i<A.size();i++){
           A.set(i,(A.get(A.get(i)/A.size()))/A.size());
        }

        System.out.println(A);

    }




}
