package collectoins_pratice;



import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OracleInterview {


    public static void main(String[] args) {
        //Integer arr[]={24,67,23,98,45,34,90,27,98,90};
        Integer arr[] = {24, 90, 67, 23, 98, 45, 34, 27};

        List<Integer> list = Stream.of(arr).collect(Collectors.toList());

        System.out.println(secoundLargest(list));

    }

    public static int secoundLargest(List<Integer> input) {
        int max = Integer.MIN_VALUE;
        int secoundMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (Integer i : input) {
            if (i > max) {
                secoundMax = max;
                max = i;
            } else if (i > secoundMax && i != max)
                secoundMax = i;

        }
        return secoundMax;

    }
}
