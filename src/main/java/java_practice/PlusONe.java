package java_practice;

public class PlusONe {
    public static void main(String[] args) {

        int A[]={1,2,3};

        plusOne(A);



    }
    public static int[] plusOne(int[] A) {
        int l=A.length-1;
        int carry=0;
        while(l>0 || carry>0){
            A[A.length-1]=(A[A.length-1]+1)%10;
            carry=(A[l]+1)/10;

            l--;
        }
        return A;
    }


}
