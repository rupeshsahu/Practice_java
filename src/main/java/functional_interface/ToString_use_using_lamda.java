package functional_interface;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{

    int number;
    String name;

    public Employee(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
       return name+":"+number;
    }
}

public class ToString_use_using_lamda {
    public static void main(String[] args) {
        Employee e1 =new Employee(3,"Rupesh");
        Employee e2 =new Employee(1,"Aman");
        Employee e3 =new Employee(2,"Tulsi");
        List<Employee> list=new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
       // Comparator<Employee> c=(o1,o2)->(o1.number<o2.number)?-1:(o1.number> o2.number)?1:0; //sorting using employee number
        Comparator<Employee> c=(o1,o2)->o1.name.compareTo(o2.name);
        Collections.sort(list,c);
        System.out.println(list);


    }



}
