package ScalerProblems.HashMapProblems;

import java.util.HashMap;

public class FindFrequencyOfElements_1stnonrepeating_element {
    public static void main(String[] args) {
        int a[]={10,20,30,20,10,60,70,70,3,40,60};
        HashMap hm=new HashMap<>();
        for(int i=0;i<a.length;i++){
           if( hm.containsKey(a[i])){
               int k=(int)hm.get(a[i]);
               ++k;
               hm.put(a[i],k);
           }
           else
               hm.put(a[i],1);

        }


        for(int i=0;i<a.length;i++){
            if((int)hm.get(a[i])==1){
                System.out.println(a[i]);
                break;
            }
        }
        System.out.println(hm);


    }
}
