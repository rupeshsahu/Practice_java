package ScalerProblems.StringManipulation;

public class ReverseSentance {

    public static void main(String[] args) {
        String str="My name is rupesh";
        System.out.println(reverse(str));

    }

    public static String reverse(String str){
        String strarr[]=str.split(" ",0);
        int len=strarr.length;
        String res="";
        for(int i=0;i<len;i++){
            strarr[i]=reverseWord(strarr[i]);
        }

        for(int i=strarr.length-1;i>=0;i--){
            res= res+" "+reverseWord(strarr[i]);

        }

        return res;

    }
    public static String reverseWord(String word){

        String res="";
        for(int j=0;j<word.length();j++){
            res=word.charAt(j)+res;
        }
        return res;
    }

}
