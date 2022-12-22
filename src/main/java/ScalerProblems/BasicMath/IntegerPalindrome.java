package ScalerProblems.BasicMath;

public class IntegerPalindrome {

    public static void main(String[] args) {
        System.out.println(palindrom(-1146467285));

    }

    public static int palindrom(int num){




        boolean negativeFlag = false;
        if (num < 0)
        {
            negativeFlag = true;
            num = -num ;
        }

        int prev_rev_num = 0, rev_num = 0;
        while (num != 0)
        {
            int curr_digit = num%10;

            rev_num = (rev_num*10) + curr_digit;

            if ((rev_num - curr_digit)/10 != prev_rev_num)
            {

                return 0;
            }

            prev_rev_num = rev_num;
            num = num/10;
        }

        return (negativeFlag == true)? -rev_num : rev_num;

    }
}
