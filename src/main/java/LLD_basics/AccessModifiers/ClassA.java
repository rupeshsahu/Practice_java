package LLD_basics.AccessModifiers;

import java.util.Date;

public class ClassA {

    private int age=26;
    private String name="Rupesh";
    private  String DOB="20-11-1995";

    String job="Informatica";

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("my name is "+name);
        System.out.println("my age is "+age);
        System.out.println("my DOB is "+DOB);
    }

}
