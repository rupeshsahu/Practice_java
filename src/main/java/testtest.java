import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.*;

public class testtest {
    public static void main(String[] args) {
        Instant now=Instant.now();
        LocalDate localDate=LocalDate.now();
//        System.out.println(now.getEpochSecond());
//        System.out.println(localDate.getDayOfWeek().name());


        List<int[]> list =new ArrayList<>();
        int []a={1,2};
        int []a1={1,2};
        int []a2={1,2};
        int []a3={1,2};
        list.add(a);
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.sort(Comparator.comparingInt((int[] arr) -> arr[0]));
        System.out.println();

    }
}
