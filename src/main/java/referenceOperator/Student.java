package referenceOperator;

import java.util.Date;

public class Student {
    String name;
    int rollno;
    int marks;
    Date dob;
    int age;
    Student(String name,int rollno,int marks,Date dob,int age){
        this.age=age;
        this.name=name;
        this.dob=dob;
        this.rollno=rollno;



    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public int getMarks() {
        return marks;
    }

    public Date getDob() {
        return dob;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", marks=" + marks +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
