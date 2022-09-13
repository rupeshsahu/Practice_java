package ScalerProblems.HashMapProblems;

import Multithreading_byDurgaSir.InterThreadComminication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContigiousArry {

    public static void main(String[] args) {
        List<Integer> al=new ArrayList<>();
        al.add(0);
        al.add(0);
        al.add(1);
        al.add(0);
        al.add(1);
        al.add(1);
        al.add(1);
        int nums[]={0,1,1,0,0,0,1,0,1,0,1,1,1,1,};





    }

    public static int arrayContigious(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {

                map.put(count, i);
            }
        }
        return maxlen;

    }
}
