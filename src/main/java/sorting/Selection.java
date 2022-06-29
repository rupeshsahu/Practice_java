package sorting;

public class Selection {
    public static void main(String[] args) {
        int[] arr={12,5,2,4,6,8};
        for(int i=0;i<arr.length-1;i++){
            int min=i;

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min]){
                    min=j;
                }

            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

       int x=5;
        int y=9;
        swap(x,y);
        System.out.println(x+"  "+y);


    }

    public static void swap(int a,int b)
    {


    }

    public static int min(int a,int b){

        return a<b?a:b;

    }

    public static int max(int a,int b){
        return a>b?a:b;

    }
}
