package ScalerProblems.StringManipulation;

public class reverseSctring {

    public static void main(String[] args) {
        System.out.println(reverseString1("rupesh sahu"));

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
public static String reverseString(String str){


        char[] ch=str.toCharArray();
        //int start=0;
        int end=str.length()-1;
        for(int start=0;start<=(str.length()-1)/2;start++){
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            end--;


        }

        return new String(ch);
}



    public static String reverseString1(String str){


     String str1="";
     for(int i=0;i<str.length();i++){
         str1=str.charAt(i)+str1;
     }
        return str1;
    }


}
