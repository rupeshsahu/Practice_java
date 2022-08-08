package ScalerProblems;

import java.util.ArrayList;

public class leftRotate {


    public static void main(String[] args) {
        ArrayList<Integer> al =new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        ArrayList<ArrayList<Integer>> al1=new ArrayList<ArrayList<Integer>> ();
        ArrayList<Integer> times =new ArrayList<Integer>();
        times.add(2);
        times.add(3);


        for(int i=0;i<times.size();i++)
        {
            al1.add(solve(al,times.get(i)));
        }


        System.out.println(al1);

    }


    public static ArrayList<Integer> solve(ArrayList<Integer> al,int n)
    {

        ArrayList<Integer> temp=new ArrayList<Integer>(al);
        for(int i=1;i<=n;i++){

            int temp1=temp.get(0);
            for(int j=0;j<temp.size()-1;j++){
                temp.set(j,temp.get(j+1));
            }
            temp.set(temp.size()-1,temp1);
        }
        return temp;

    }
}
