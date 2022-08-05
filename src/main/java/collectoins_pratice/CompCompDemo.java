package collectoins_pratice;

import java.util.TreeSet;

public class CompCompDemo {
    public static void main(String[] args) {
        Employee e1=new Employee("rupesh",100);
        Employee e2=new Employee("puneet",101);
        Employee e3=new Employee("pranjal",102);
        Employee e4=new Employee("aman",103);
        Employee e5=new Employee("rupesh",101);

        TreeSet t =new TreeSet();

        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        TreeSet t1 =new TreeSet(new MyComparator());
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);




        System.out.println(t1);

    }
}
