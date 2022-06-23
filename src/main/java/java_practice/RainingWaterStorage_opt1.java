package java_practice;

public class RainingWaterStorage_opt1 {
    public static void main(String[] args) {

        int arr[]={6, 2, 7, 2, 4};
      int preMax[]=new int[arr.length+1];
      int suffixMax[]=new int[arr.length+1];
      preMax[0]=0;
      suffixMax[suffixMax.length-1]=0;

      for(int i=0;i<arr.length;i++){
          preMax[i+1]=max(preMax[i],arr[i]);
      }

      for(int i= arr.length-1;i>=0;i--){
          suffixMax[i]=max(suffixMax[i+1],arr[i]);
      }
       int ans=0;
      for(int i=0;i< arr.length;i++){

          int leftMax=preMax[i+1];
          int rightMax=suffixMax[i];
          int support1=min(leftMax,rightMax);
          if(support1>arr[i])
              ans=ans+(support1-arr[i]);

      }

        System.out.println(ans);




    }

    public static int max(int i, int j){

        return i>j?i:j;
    }

    public static int min(int i, int j){

        return i<j?i:j;
    }
}
