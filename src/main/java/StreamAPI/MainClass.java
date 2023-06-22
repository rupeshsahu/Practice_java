package StreamAPI;

import Core_java.A;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {


        List<Employees> employeesList= new ArrayList<>();
        Employees e1=new Employees("Rupesh","Sagar mp",101,new Date(System.currentTimeMillis()));
        Employees e2=new Employees("Satish","Sagar mp",102,new Date(System.currentTimeMillis()));
        Employees e3=new Employees("akash","Sagar mp",103,new Date(System.currentTimeMillis()));
        Employees e4=new Employees("yash","Sagar mp",104,new Date(System.currentTimeMillis()));
        Employees e5=new Employees("lucky","Sagar mp",105,new Date(System.currentTimeMillis()));
        Employees e6=new Employees("aman","Sagar mp",106,new Date(System.currentTimeMillis()));
        Employees e7=new Employees("rocky","Sagar mp",107,new Date(System.currentTimeMillis()));
        Employees e8=new Employees("ashwani","Sagar mp",108,new Date(System.currentTimeMillis()));

            employeesList.add(e1);
            employeesList.add(e2);
            employeesList.add(e3);
            employeesList.add(e4);
            employeesList.add(e5);
            employeesList.add(e6);
            employeesList.add(e7);
            employeesList.add(e8);
            // employeesList.stream().sorted((((o1, o2) -> )))
        Comparator<Employees> c=(o1,o2)->o1.name.compareTo(o2.name);
       employeesList.stream().sorted(c);
        System.out.println(employeesList);





    }
}
