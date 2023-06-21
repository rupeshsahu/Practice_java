public class MethodAndConstructorRefeenceOperator {

    public  void m1(){

        for (int i=0;i<10;i++){
            System.out.println(i);
        }
    }
// code Reusability is possible because of :: this operator. Systax:--->
// static method--> classname::method name
    //instance method--> object reference:: method name
    //in method reference args should be match.
    //dont worry about return type
    public static void main(String[] args) {
        MethodAndConstructorRefeenceOperator obj =new MethodAndConstructorRefeenceOperator();
        Runnable r=obj::m1;
        Thread t =new Thread(r);
        t.start();
    }
}
