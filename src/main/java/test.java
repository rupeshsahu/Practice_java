public class test {


    public void display(Object o){

        System.out.println("Object");
    }
    public void display(String str){

        System.out.println("String");
    }

    public static void main(String[] args) {
        test t=new test();
        t.display(null);


    }


}
