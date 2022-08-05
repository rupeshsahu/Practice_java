package java_practice;

import java.util.Map;

public class SumOfBinaryString {


    public static void main(String[] args) {
        System.out.println(addBinary());
    }

    public static String addBinary() {
        String s1="100";
        String s2="111";
        int sum=0;
        char res[]=new char[max(s1.length(),s2.length())+1];
        int i=s1.length()-1;
        int j=s2.length()-1;
        int carry=0;
        int k=max(s1.length(),s2.length());
        while(i>=0 || j>=0 || carry!=0){
            sum=carry;


         if(i>=0){
             sum=sum+s1.charAt(i)-'0';
         }
         if(j>=0){
             sum=sum+s2.charAt(j)-'0';
         }
         res[k]=(char)((sum%2)+'0');
         carry=sum/2;
         i--;
         j--;
         k--;

        }
        if(res[0]=='1')
            return new String(res);
        return new String(res,1,max(s1.length(),s2.length()));

    }
    public static int max(int a,int b)
    {
       return (a>b?a:b);
    }
}
