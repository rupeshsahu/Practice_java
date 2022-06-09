package LLD_basics.AccessModifiers;

public class MainClass {


    public static void main(String[] args) {
        ClassB obj=new ClassB();
        System.out.println(obj.getAge());
        System.out.println(obj.getDOB());
        obj.setAge(27);
        System.out.println(obj.getAge());


    }


}
