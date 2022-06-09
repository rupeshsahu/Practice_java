package LLD_basics.copyConstructor;

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

    Student(Student other){
        name=other.name;
        address= other.address;
        email= other.email;
        state= other.state;
        psp= other.psp;
        batch= other.batch;
    }

    Student(String name,String address)
    {
        this.name=name;
        this.address=address;

    }





}
