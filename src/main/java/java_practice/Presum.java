package java_practice;

public class Presum {

    public static void main(String[] args) {

        int arr[]={2,3,1,2,4,2,1,2};
        int preSum[]=new int[arr.length+1];
       preSum[0]=0;
        int sum=0;
        for (int i=0;i<arr.length;i++){
           preSum[i+1]=preSum[i]+arr[i];
        }

        for(int a:preSum){
            System.out.println(a);
        }


    }
}
