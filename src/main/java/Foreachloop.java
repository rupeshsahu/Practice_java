import java.util.ArrayList;

public class Foreachloop {

    public static void main(String[] args) {
        int a[]={1,2,3,5,6,7,8};
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i:a){
            al.add(i);
        }

        for(int x=0;x<al.size();x++){
            if(al.get(x)==3)
                al.remove(al.get(x));

        }
        System.out.println(al);
    }
}
