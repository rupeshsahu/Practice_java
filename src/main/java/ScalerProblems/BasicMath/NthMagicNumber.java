package ScalerProblems.BasicMath;

public class NthMagicNumber {


    public static void main(String[] args) {
        System.out.println(nthMagicNo(10));



    }

    static int nthMagicNo(int n)
    {
        int pow = 1, answer = 0;

        // Go through every bit of n
        while (n != 0)
        {
            pow = pow*5;

            // If last bit of n is set
            if ((int)(n & 1) == 1)
                answer += pow;


            n >>= 1;
        }
        return answer;
    }

}
