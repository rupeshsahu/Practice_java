package collectoins_pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestTest {

    public static void main(String[] args) {
        List<Integer> listNumbers=new ArrayList<>();
        listNumbers.add(5);
        listNumbers.add(10);
        listNumbers.add(17);
        listNumbers.add(20);
        listNumbers.add(7);
        Collections.sort(listNumbers);
        listNumbers.stream().filter((i)->i%2==0).collect(Collectors.toList()).forEach(System.out::println);
        int a=10;
        int b=20;

        int c=a>b?a:b;
        System.out.println(c);





    }
}

