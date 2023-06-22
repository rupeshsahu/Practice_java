package referenceOperator;

import java.util.Date;

public class MainClassStudent {
    public static void main(String[] args) {
        Gettable get=((name, rollno, marks, dob, age) -> new Student(name,rollno,marks,dob,age));
       Student s= get.getStudent("Rupesh",1001,100,new Date(System.currentTimeMillis()),27);
        System.out.println(s);

    }
}
