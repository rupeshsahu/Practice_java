package ScalerProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        ArrayList A=new ArrayList<>();
        A.add(1);
        A.add(1);
        A.add(1);
        A.add(1);
        A.add(2);
        A.add(2);
        A.add(2);
        A.add(3);
        A.add(3);
        A.add(3);
        A.add(3);
        A.add(3);
        LinkedHashSet ls=new LinkedHashSet<>(A);
        ArrayList al=new ArrayList<>(ls);
        System.out.println(ls);





    }
}
