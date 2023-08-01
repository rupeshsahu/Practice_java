package oops;

public class BinarySearch {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(a,10));

    }

    public static int binarySearch(int a[],int num){
        int l=0;
        int r=a.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(a[m]==num){
                return m;
            }

            if(a[m]<num)
                l=m+1;
            else
                r=m-1;

        }

        return -1;

    }
}
