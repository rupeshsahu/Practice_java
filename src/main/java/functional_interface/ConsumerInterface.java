package functional_interface;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConsumerInterface {
    public static void main(String[] args) {
        Employee e1 = new Employee(3, "Rupesh");
        Employee e2 = new Employee(1, "Aman");
        Employee e3 = new Employee(2, "Tulsi");
        List<Employee> employees=Stream.of(e1,e2,e3).collect(Collectors.toList());
            Consumer<List> c1 = employee -> System.out.println(e1.name + " : " + e1.number);
            Consumer<List> c2 = employee -> System.out.println(e2.name + " : " + e2.number);
            Consumer<List> c3 = employee -> System.out.println(e3.name + " : " + e3.number);



            Consumer<List> cc= c1.andThen(c2).andThen(c3);
            cc.accept(employees);


        }
    }
