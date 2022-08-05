package collectoins_pratice;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_example {
    public static void main(String[] args) {

        ArrayList al =new ArrayList();
        for (int i=0;i<10;i++)
            al.add(i);

        Iterator itr= al.iterator();
        while(itr.hasNext()){


            int j=(Integer)itr.next();

            if(j%2==0) {

                System.out.println(j);
            }
            else
                itr.remove();
        }
        System.out.println(al);

    }
}
