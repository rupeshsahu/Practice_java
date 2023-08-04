package oops;


public class MainClass {
    public static void main(String[] args) {
//        SingleTonClass singleTonClass1=SingleTonClass.getInstance();
//        SingleTonClass singleTonClass2=SingleTonClass.getInstance();
//        SingleTonClass singleTonClass3=SingleTonClass.getInstance();
        String str="Hello";
        String str3="Hello";
        String str1= new String("Hello");
        String str2=new String("Hello");
        Boolean check = str==str1;
        System.out.println(str.equals(str1));
        System.out.println(str1.equals(str2));

        System.out.println(str1==str2);
        System.out.println(str==str3);

        System.out.println("done");

    }
}
