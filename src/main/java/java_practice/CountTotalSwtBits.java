package java_practice;

public class CountTotalSwtBits {

    public static void main(String[] args) {

        int a=10;
        int count=0;

        for(int i=1;i<=a;i++) {
            int digit=i;
            while (digit>0) {
                digit=digit&(digit-1);
                    count++;

            }
        }
        System.out.println(count);


    }
}
