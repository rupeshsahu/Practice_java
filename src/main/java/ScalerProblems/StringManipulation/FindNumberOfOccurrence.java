package ScalerProblems.StringManipulation;

public class FindNumberOfOccurrence {

    public static void main(String[] args) {
        System.out.println(solve("bobssbbob"));

    }

    public static int solve(String A) {
        int count=0;

        for(int i=0;i<A.length()-2;i++){

            if(A.substring(i,i+3).equals("bob"))
                count++;
        }


        return count;
    }
}
