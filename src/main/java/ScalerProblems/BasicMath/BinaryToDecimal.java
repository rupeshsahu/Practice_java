package ScalerProblems.BasicMath;

public class BinaryToDecimal {

    public static void main(String[] args) {
        System.out.println(
                binaryToDecimal(101010)
        );

    }







    public static int binaryToDecimal(int a){
        int result=0;
        int pow=1;
        while(a>0){
            int digit=a%10;
            if(digit==1)
                result =result+pow;
            pow=pow*2;

            a=a/10;
        }
return result;
    }
}




