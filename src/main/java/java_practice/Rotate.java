package java_practice;

import java.util.Scanner;

public class Rotate {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int a[]=new int[l];
        for(int i=0;i<l;i++)
            a[i]=sc.nextInt();
        int n = sc.nextInt();

        while (n > 0) {
            int temp = a[a.length - 1];

            for (int i = a.length - 2; i >= 0; i--) {
                a[i + 1] = a[i];

            }
            a[0] = temp;
            n--;
        }

        for(int arr:a){
            System.out.println(arr+" ");
        }

    }
}
