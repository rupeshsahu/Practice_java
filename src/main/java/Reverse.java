public class Reverse {

    public static void main(String[] args) {
        System.out.println(reverse(98123));

    }

    public static int reverse(int i){
        int reverse=0;

        while(i>0){

            reverse=reverse*10 +(i%10) ;
            i=i/10;

        }

        return reverse;

    }

}
