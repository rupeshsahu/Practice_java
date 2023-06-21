package collectoins_pratice.LIst_interface;

import java.util.ArrayList;
import java.util.List;

public class AL_practice {

    public static void main(String[] args) {
        List<Integer> list =new ArrayList<Integer>();
        int i=0;
        do {
            list.add((int) (Math.random()/Math.nextDown(.1)));
            i++;
        }while(i<10);

        System.out.println(list);
    }


}
