package ScalerProblems.ProblemSolving4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MultiplesOfPrimeNumbers {
    public static List<Integer> listOfMultiples(int a, int b, int c, int n) {
        Set<Integer> multiples = new HashSet<>();
        multiples.add(1);

        for (int i = 2; i <= n; i++) {
            if (multiples.contains(i - 1)) {
                multiples.add(a * (i - 1));
                multiples.add(b * (i - 1));
                multiples.add(c * (i - 1));
            }
        }

        List<Integer> result = new ArrayList<>(multiples);
        result.sort(null); // Sort the list in ascending order

        return result;
    }

    public static void main(String[] args) {
        System.out.println(listOfMultiples(2, 3, 5, 20));
    }
}
