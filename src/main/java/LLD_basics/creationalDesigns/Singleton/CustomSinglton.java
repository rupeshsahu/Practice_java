package LLD_basics.creationalDesigns.Singleton;

import java.io.Serializable;

public class CustomSinglton implements Cloneable, Serializable {

    private static CustomSinglton customSinglton = null;

    private CustomSinglton() {
        // no operation
    }

    public static CustomSinglton getInstance() {

        if (customSinglton == null) {

            synchronized (CustomSinglton.class) {

                if (customSinglton == null) {
                    customSinglton = new CustomSinglton();
                }

            }
        }
        return customSinglton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        throw new CloneNotSupportedException();
        //return customSinglton;
    }

    public Object readResolve() {
        return customSinglton;
    }

}
