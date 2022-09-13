package ScalerProblems.StringManipulation;

public class reverseSctring {

    public static void main(String[] args) {
        System.out.println(reverseString("rupesh"));

    }

//    public static String reverseString(String str){
//
//        String res="";
//        for(int i=0;i<str.length();i++){
//           res=str.charAt(i)+res;
//
//        }
//
//        return res;
//
//    }
public static StringBuilder reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        int i=0,j=str.length()-1;

        sb.reverse();
        return sb;
}


}
