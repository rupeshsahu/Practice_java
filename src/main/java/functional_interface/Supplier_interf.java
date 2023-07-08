package functional_interface;

import java.util.Random;
import java.util.function.Supplier;

public class Supplier_interf {

    public static void main(String[] args) {
        Supplier<String> s=()-> {
            String otp="";
            for(int i=0;i<6;i++){
             otp=otp+new Random().nextInt(10);
            }
            return otp;
        };

        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());

    }
}
