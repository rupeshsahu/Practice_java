package ScalerProblems;

import java.util.ArrayList;

public class RotateArray_ArrayList {
    public static void main(String[] args) {
        int m=4,n=4;
//        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        ArrayList<ArrayList<Integer>> al=new ArrayList();
        ArrayList al1=new ArrayList<>();
        ArrayList al2=new ArrayList<>();
        ArrayList al3=new ArrayList<>();
        ArrayList al4 =new ArrayList<>();
        al1.add(1);
        al1.add(2);
        al1.add(3);
        al1.add(4);
        al2.add(5);
        al2.add(6);
        al2.add(7);
        al2.add(8);
        al3.add(9);
        al3.add(10);
        al3.add(11);
        al3.add(12);
        al4.add(13);
        al4.add(14);
        al4.add(15);
        al4.add(16);

        al.add(al1);
        al.add(al2);
        al.add(al3);
        al.add(al4);

        int ln=al.size();
        //System.out.println(al);

        for(int i=0;i<m;i++)
        {
            for(int j=i;j<n;j++){
                int temp=al.get(i).get(j);
                al.get(i).set(j,al.get(j).get(i));
                al.get(j).set(i,temp);
            }
        }

 int l=0,r=n-1;

        while(l<=r){

            for(int i=0;i<m;i++){
                int temp=al.get(i).get(l);
                al.get(i).set(l,al.get(i).get(r));
                al.get(i).set(r,temp);
            }
            l++;
            r--;
        }

        System.out.println(al);
    }
}
