package LLD_basics.copyConstructor;

public class MainClass {

    public static void main(String[] args) {

Student rupesh=new Student("Rupesh Sahu","Sagar mp");
rupesh.state="ACTIVE";
rupesh.email="rupeshsahu7509@gmail.com";
rupesh.psp=6.8;
rupesh.batch="july21";
rupesh.pauseCourse();
rupesh.changeBatch("march2022");
        System.gc();
Student newRupesh=new Student(rupesh);
        System.out.println(rupesh.name);
        newRupesh.name="newRupesh";
        System.out.println(rupesh.name);
        System.out.println(newRupesh.name);



    }
}
