package ScalerProblems.HashMapProblems;

import java.util.HashMap;

public class HashMap_NPE_handle {


    public static void main(String[] args) {

        HashMap_NPE_handle a=new HashMap_NPE_handle();
        a.doo("asdfzxcvqwer");
    }

    private HashMap<Character, Boolean> myMap;

    public HashMap_NPE_handle() {
        myMap = new HashMap<Character, Boolean>();
        String mychars = "rupesh";
        for (char c : mychars.toCharArray())
            myMap.put(c, true);
        System.out.println(myMap);
    }

    public void doo(String input) {
        StringBuilder output = new StringBuilder();
        for (char c : input.toCharArray()) {
            Boolean b = myMap.get(c);
            if (b != null && b) {                               //handling NPE here
                output.append(c);
            }

        }
        System.out.println(output);

    }

}
