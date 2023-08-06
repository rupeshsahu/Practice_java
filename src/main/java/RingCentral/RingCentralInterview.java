package RingCentral;

public class RingCentralInterview {

    /*The given function signature sqrt(number, precision) returns a value that satisfies the minimum precision requirement   For
    example, when we call sqrt(2, 0.001), it should return 1.414 with a precision of 0.001. Similarly,
     when we call sqrt(2, 0.01), it should return 1.41 with a precision of 0.01.*/
    public static void main(String[] args) {

        System.out.println(sqrt(3,0.01));
        System.out.println(countDigit(0.001));

        System.out.println(3d3);

       // System.out.println(0.001<0.000001);


    }

    public static double sqrt(double number, double precision) {

        if (number < 0) {
            throw new IllegalArgumentException("Square root of negative numbers is not supported.");
        }

        double start = 0;
        double end = number;
        double mid=0, result;

        // Using binary search to find the square root with the required precision
        while (start <= end) {
            mid = (start + end) / 2;
            result = mid * mid;

            // Check if the result is close enough to the given number with the required precision
            if (Math.abs(end - start) < precision) {
                return mid;
            } else if (result < number) {
                // If the square is less than the number, move the start pointer to the right
                start = mid;
            } else {
                // If the square is greater than the number, move the end pointer to the left
                end = mid;
            }
        }
        String str=
        return mid; // Return the current best approximation
    }

    public static int countDigit(double input){
        double i=input;
        int count=0;
        while (i<1){
            i=i*10;
            count++;
        }
        return count;

    }

}




