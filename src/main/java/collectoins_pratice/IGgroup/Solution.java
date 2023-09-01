package collectoins_pratice.IGgroup;


    public class Solution {
        public static boolean solution(String S) {
            int countA = 0;
            int countB=0;


            for (char c : S.toCharArray()) {
                if (c == 'a') {
                    countA++;
                    if(countB!=0)
                        return false;
                } else if (c == 'b') {
                    countB++;
                    if (countA == 0) {
                        return false; // 'b' appears before 'a'
                    }
                }
            }

            return true;
        }

        public static void main(String[] args) {


            // Test cases
            System.out.println("aabbb "+solution("aabbb"));  // true
            System.out.println("ba "+solution("ba"));     // false
            System.out.println("aaa "+solution("aaa"));    // true
            System.out.println("abba "+solution("abba"));   // false
            System.out.println(solution(""));       // true
        }
    }


