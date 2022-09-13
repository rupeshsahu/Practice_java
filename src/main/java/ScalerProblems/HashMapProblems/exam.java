package ScalerProblems.HashMapProblems;

public class exam {

    public static String total(String[] groceryList) {
        StringBuilder res=new StringBuilder("");
        int alltotal=0;

        for (int i = 0; i < groceryList.length; i++) {

            String str = groceryList[i].trim();
            String arr[] =str.split("[\" -\"]-:;\" \"]");
            String product = arr[0];
            int ppu = Math.abs(Integer.parseInt(arr[1]));
            int amount = Integer.parseInt(arr[2]);
            int total=ppu*amount;
            alltotal=alltotal+total;

            res=res.append(total+"+");


        }
        res.deleteCharAt(res.length()-1);
        res.append("=");
        res.append(alltotal);
        String result=new String(res);
        return result;
    }

        public static void main (String[]args){

        String st[]={"bread -1;1 ","apple 5-1","orange-6-1","banana-6;12","papaya-6-10","bread -1;1 "};
            System.out.println(total(st));








        }


}


