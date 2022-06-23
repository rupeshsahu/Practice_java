package java_practice;

public class RainingWaterStorage {
    public static void main(String[] args) {

        int arr[]={6,2,7,4,8};
        int total_water=0;

        for (int i=0;i<arr.length;i++)
        {
            int water_support=0;
            int leftmax=0;
            int rightmax=0;
            for(int j=0;j<i;j++){
                leftmax=leftmax>arr[j]?leftmax:arr[j];
            }

            for(int j=i+1;j<arr.length;j++){
                rightmax=rightmax>arr[j]?rightmax:arr[j];

            }
            water_support=leftmax<rightmax?leftmax:rightmax;
            if (water_support>arr[i])
                total_water=total_water+(water_support-arr[i]);

        }
        System.out.println(total_water);



    }
}
