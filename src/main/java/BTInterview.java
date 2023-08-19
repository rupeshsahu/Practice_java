public class BTInterview {

    public static void main(String[] args) {

    }
    static int stringSub(int N, String S) {
        if (N <= 1) {
            return 0; // No need to remove anything for a single character or empty string
        }

        int[] freq = new int[26];

        for (char c : S.toCharArray()) {
            freq[c - 'a']++;
        }

        int oddCount = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                oddCount++;
            }
        }

        // Minimum length substring to remove is (oddCount - 1) if oddCount > 1, otherwise 0
        return oddCount > 1 ? N - oddCount : 0;
    }

}
