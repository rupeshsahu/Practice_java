package ScalerProblems.BasicMath;
import ScalerProblems.BasicMath.NumbersOfFactors;

import java.util.ArrayList;

public class DoorsToggle {

    public static void main(String[] args) {
        System.out.println(doorsOpen(2));


    }

    public static ArrayList<Integer> doorsOpen(int doors){
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<=doors;i++){

            if(NumbersOfFactors.howManyFactors(i)%2==1)
                al.add(i);


        }


        return al;
    }



}
