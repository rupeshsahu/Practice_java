import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OracleInterview {

    public static void main(String[] args) {

        int a[]={1,6,4,2,8,5};
        sort(a);
        int result=secoundSmallest(a,2);
        System.out.println(result);

        for(int i:a){
            System.out.println(i);
        }
    }

    public static int secoundSmallest(int [] arr, int n){

        return arr[n-1];
    }

    public static void sort(int [] arr){



        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j])
                {
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }


        }






    }


}
