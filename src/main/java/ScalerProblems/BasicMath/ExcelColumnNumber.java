package ScalerProblems.BasicMath;

import java.util.Collections;

public class ExcelColumnNumber {

    public static void main(String[] args) {
        System.out.println(excelColumn("AB"));



    }

    public static int excelColumn(String str){
        int result=0;
        int power=0;
        for(int i=str.length()-1;i>=0;i--){
           int nn= (int)str.charAt(i)-64;
           result=result+(nn*power(26,power));
           power++;

        }
return result;
    }

    public static int power(int digit, int n){
        int result=1;
        while(n>0)
        {
            result=result*digit;
            n--;
        }

        return result;
    }

}
