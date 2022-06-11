package LLD_basics.polimorphism;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void changePassword(List<User> users){

        for(User user:users){
user.doSomething();
            if (user instanceof Student){
                System.out.println("I am a Student");
                Student student=(Student)user;
                System.out.println(student.mentor);

            }
            if (user instanceof Mentor){
                System.out.println("I am a Mentor");


            }
            if (user instanceof TA){
                System.out.println("I am a TA");


            }
        }

    }


    public static void main(String[] args) {

        User user=new TA();
        User user1=new Student();
        User user2=new Mentor();
        User user3=new User();
        List<User> users= new ArrayList<>();
        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        changePassword(users);

        System.out.println(users);

    }
}
