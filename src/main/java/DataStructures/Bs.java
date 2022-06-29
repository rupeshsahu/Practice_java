package DataStructures;

public class Bs {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int x=10;
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(x==arr[mid]){
                System.out.println("fpund: "+arr[mid]);
                break;
            } else if (x>arr[mid]) {
                low=mid+1;
            }
            else
                high=mid-1;
        }



    }
}
