package collectoins_pratice.IGgroup;

public class MultipleOf3And5 {

    public static void main(String[] args) {



    }
//Brute force method:-

    public static int sumMultiplesOf3And5(int n) {
        if (n < 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    /*******************************************************************************************************************************/

    //optimized method:-

    public static int sumMultiplesOf3AndFive(int n) {
        if (n <= 0) {
            return 0;
        }

        n--; // We're interested in numbers strictly below n

        int sum = 0;

        // Calculate sum of multiples of 3
        int count3 = n / 3;
        sum += 3 * count3 * (count3 + 1) / 2;

        // Calculate sum of multiples of 5
        int count5 = n / 5;
        sum += 5 * count5 * (count5 + 1) / 2;

        // Calculate sum of multiples of 15 (to subtract)
        int count15 = n / 15;
        sum -= 15 * count15 * (count15 + 1) / 2;

        return sum;
    }


}
