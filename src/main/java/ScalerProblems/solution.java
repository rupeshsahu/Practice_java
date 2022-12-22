package ScalerProblems;

public class solution {

    public static void main(String[] args) {

        System.out.println(result(3,2,12));

    }


    public static int result(int a,int b,int c){{
        int result=0;
        for(int i=c;i>=1;i--){
            if(i%a==b) {
                result = i;
                break;
            }

        }







    return result;
    }
    }

}
