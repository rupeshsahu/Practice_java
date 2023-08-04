package ScalerProblems.ArraysAndMath;

import multithreading_durgasir.MyThread;

public class WaterTrapOrderOfN {
    public static void main(String[] args) {

        int b[]= new int[]{2, 3, 9, 2, 12,5,1,8,4,10,8,1};
        System.out.println(totalWaterTrap(b));

    }

    private static int totalWaterTrap(int[] b) {
        int sum=0;

        int prefixMax[]=new int[b.length];
        int suffixMax[]=new int[b.length];
        suffixMax[suffixMax.length-1]=b[b.length-1];
        prefixMax[0]=b[0];
        for(int i=1;i<prefixMax.length;i++)
            prefixMax[i]= Math.max(b[i],prefixMax[i-1]);

        for(int i=suffixMax.length-2;i>=0;i--)
            suffixMax[i]= Math.max(b[i],suffixMax[i+1]);

        for(int i=1;i<b.length-1;i++){
            int current=b[i];
            int leftmax=Math.max(b[i],prefixMax[i-1]);
            int rightmax=Math.max(b[i],suffixMax[i+1]);
            int waterTrap=Math.min(leftmax,rightmax)-b[i];
            sum=sum+waterTrap;
        }






        return sum;

    }
}
