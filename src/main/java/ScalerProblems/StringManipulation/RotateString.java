package ScalerProblems.StringManipulation;

public class RotateString {

    public static void main(String[] args) {
        String A="scaler";

        char arr[]=A.toCharArray();


        for(int j=1;j<=2;j++){
            char temp=arr[arr.length-1];
            for(int i=arr.length-1;i>0;i--){
                arr[i] =arr[i-1];

            }
            arr[0]=temp;

        }
        System.out.println(String.valueOf(arr));

    }
}
