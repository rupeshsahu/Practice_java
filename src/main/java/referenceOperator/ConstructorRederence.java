package referenceOperator;

class  Sample{
    Sample(String str){
        System.out.println("this is arg constructor"+str);
    }
}
@FunctionalInterface
interface I1{
    public Sample  get(String str);

}

public class ConstructorRederence {
    public static void main(String[] args) {
        I1 i=Sample::new;
        i.get("RUpesh");



    }
}
