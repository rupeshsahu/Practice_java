package collectoins_pratice.Collectopm_INterf;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionPracticeCommanClass {

    public static void main(String[] args) {
        Collection<Integer> c= new ArrayList<>();
        c.removeIf(i->i<2);


    }
}
