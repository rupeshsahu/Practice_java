package ScalerProblems.Sorting;

import java.util.Arrays;

public class NobelInteger {
    public static void main(String[] args) {

        int arr[]={ -1, -2, 0, 0, 0, -3};
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){

            if(arr[i]!=arr[i+1]) {
            continue;}

                if (arr[i] == arr.length - i - 1) {
                    System.out.println(arr[i]);
                    break;
                }

            }



        System.out.println(-1);

    }
}
