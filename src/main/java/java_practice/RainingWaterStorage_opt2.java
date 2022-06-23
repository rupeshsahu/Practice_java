package java_practice;

public class RainingWaterStorage_opt2 {
    public static void main(String[] args) {

        int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int max_i = 0;
        int max_n = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_n) {
                max_n = arr[i];
                max_i = i;
            }
        }
        int ans = 0;
        int ans1 = 0;
        int currmax = 0;
        for (int i = 0; i < max_i; i++) {
            int leftmax = 0;
            int rightmax = 0;
            currmax = max(currmax, arr[i]);
            leftmax = currmax;
            rightmax = max_n;
            int support = min(leftmax, rightmax);

            if (support > arr[i]) {
                ans = ans + (support - arr[i]);
            }
        }






                int currmax1=0;
            for (int j = arr.length - 1; j > max_i; j--) {
                int leftmax1 = 0;
                int rightmax1 = 0;
               currmax1 = max(currmax1, arr[j]);
                leftmax1 = max_n;
                rightmax1 = currmax1;
                int support = min(leftmax1, rightmax1);

                if (support > arr[j]) {
                    ans1 = ans1 + (support - arr[j]);
                }
            }
        System.out.println(ans+ans1);

            }






        public static int max ( int i, int j){

            return i > j ? i : j;
        }

        public static int min ( int i, int j){

            return i < j ? i : j;
        }
    }

