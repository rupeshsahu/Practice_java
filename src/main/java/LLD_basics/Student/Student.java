package LLD_basics.Student;

public class Student {
    String name;
    String address;
    String email;
    String state;
    double psp;
    String batch;

    void changeBatch(String newBatch){
        this.batch=newBatch;


    }

    void pauseCourse(){
        this.state="paused";
    }
/*
    Student(){
        System.out.println("calling constructor of student");
    }*/

   /* Student(String str){
        System.out.println("calling constructor with parameter"+str);
    }*/


}
