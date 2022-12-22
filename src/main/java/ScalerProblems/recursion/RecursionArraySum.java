package ScalerProblems.recursion;

import java.util.ArrayList;

public class RecursionArraySum {

    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
       al.add(-12);
        al.add(-13);
        al.add(-14);
        al.add(-15);
        al.add(-16);
        al.add(-17);
        al.add(-18);
        System.out.println(sumArrayRecursion(al));
//        System.out.println(al.remove(6));
//        System.out.println(al.size());


    }

    public  static int sumArrayRecursion(ArrayList al){

        if(al.size()==1)
            return (int)al.get(0);
        return (int)al.remove(al.size()-1)+sumArrayRecursion(al);

    }

}
