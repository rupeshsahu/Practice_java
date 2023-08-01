package ScalerProblems.ArraysAndMath;

public class WaterTrapProblem {
    public static void main(String[] args) {

        int b[]= new int[]{2, 3, 9, 2, 12,5,1,8,4,10,8,1};
        System.out.println(totalWaterTrap(b));

    }



    public static int totalWaterTrap(int b[]){
        int sum=0;
        for(int i=0;i<b.length;i++){
            int leftmax = 0;
            int rightmax = 0;
            int waterTrapped=0;
            for(int j=0;j<=i;j++)
                leftmax=Math.max(b[j],leftmax);

            for(int k=i;k<b.length;k++)
                rightmax=Math.max(b[k],rightmax);

            waterTrapped=Math.min(leftmax,rightmax)-b[i];

            sum=sum+waterTrapped;


        }





        return sum;

    }


}
