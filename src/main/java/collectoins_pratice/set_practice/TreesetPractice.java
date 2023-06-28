package collectoins_pratice.set_practice;



import java.util.SortedSet;
import java.util.TreeSet;

public class TreesetPractice
{
    public static void main(String[] args) {
        TreeSet<StringBuffer> ss=new TreeSet<>();
        ss.add(new StringBuffer("A"));
        ss.add(new StringBuffer("B"));
        ss.add(new StringBuffer("C"));
        ss.add(new StringBuffer("D"));
        ss.add(new StringBuffer("E"));

       // ss.add(12);
        if(ss.isEmpty())
            System.out.println("Treeset is empty");
        System.out.println(ss);
        /*ss.add(12);

        ss.add(23);
        ss.add(44);
        ss.add(11);*/

    }
}
