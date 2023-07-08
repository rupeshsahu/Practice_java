package functional_interface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class BiFunction_interf {
public static class Employee{
    String ename;
    int eno;

    @Override
    public String toString() {
        return "Employee{" +
                "ename='" + ename + '\'' +
                ", eno=" + eno +
                '}';
    }

    public Employee(String ename, int eno) {
        this.ename = ename;
        this.eno = eno;
    }
}
    public static void main(String[] args) {

        BiFunction<String,Integer,Employee> bf =(a,b)->new Employee(a,b);
        List<Employee> list= new ArrayList<>();
        list.add(bf.apply("Rupesh",101));
        list.add(bf.apply("Satish",102));
        list.add(bf.apply("Aman",104));
        list.add(bf.apply("Ashwani",103));
        list.add(bf.apply("kamal",105));
        list.add(bf.apply("kaka",106));

        System.out.println(list);
        Comparator<Employee> c=(a,b)->a.ename.compareTo(b.ename);
       list= list.stream().sorted(c).collect(Collectors.toList());
        System.out.println(list);


    }

}
