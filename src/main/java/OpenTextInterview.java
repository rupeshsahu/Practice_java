public class OpenTextInterview {

    public static void main(String[] args) {

        //0,1,1,2,3,5,8,13.....

        // System.out.println(fabonacciSeties(1));

        for(int j=0;j<10;j++)
            System.out.println(fabonacciSeties(j));


    }

    /*public static void fibinacciSeries(int i){
        int num=0;
        int j=0,k=1;


        for (int l=1;l<i;i++){
            num=

        }

    }*/

    public static int fabonacciSeties(int i){

        if (i==0)
            return 0;
        if(i==1)
            return 1;

        return fabonacciSeties(i-1)+fabonacciSeties(i-2);
    }
}
