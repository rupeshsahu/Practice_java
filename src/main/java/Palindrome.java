public class Palindrome {

    public static void main(String[] args) {

        System.out.println(checkPalindrom(" Mom"));//moM//   OpenText


        /*\
       String  resutl=;
       char letter=t

       'letter'+result;
        *
        * */
    }

    public static boolean checkPalindrom(String input){
        boolean ans=false;
        StringBuilder sb=new StringBuilder(input);
        String reverse=sb.reverse().toString();

        if(input.equals(reverse))
            ans=true;
        return ans;
    }
}
