package LLD_basics.polimorphism;

public class CompileTimePolymorphism {


    public static void print(){
        System.out.println("print with no arguments");

    }
    public static void print(String str){
        System.out.println("print with one  arguments " +str);


    }
    public static void print(String str1, String str2){
        System.out.println("print with two arguments "+str1+"  "+str2);

    }

    public static void main(String[] args) {

        print();
        print("Rupesh");
        print("Rupesh","Sahu");

    }

}
