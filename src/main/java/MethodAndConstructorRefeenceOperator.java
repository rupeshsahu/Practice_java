public class MethodAndConstructorRefeenceOperator {

    public static void m1(){

        for (int i=0;i<10;i++){
            System.out.println(i);
        }
    }
// code Reusability is possible because of :: this operator. Systax:--->
// static method--> classname::method name
    //instance method--> object reference:: method name
    //
    public static void main(String[] args) {
        Runnable r=MethodAndConstructorRefeenceOperator::m1;
        Thread t =new Thread(r);
        t.start();
    }
}
