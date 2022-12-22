package ScalerProblems.StringManipulation;

public class UseOfMyImmutableClass {

    public static void main(String[] args) {
        MyImmutableClass mi= new MyImmutableClass(100);
        mi.modify(200);
       //mi.modify(100);
        System.out.println(mi.modify(200).getI());
        mi.modify(300);

 
    }
}


