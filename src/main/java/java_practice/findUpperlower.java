package java_practice;

public class findUpperlower {

    public static void main(String[] args) {

        String str="AAA@bbb";
        int upper=0;
        int lower=0;
        String str111 ="aacccvv@ddffs#dd";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=65 && str.charAt(i)<=90){
                upper++;

            }
            if(str.charAt(i)>=97 && str.charAt(i)<=122){
                lower++;

            }

        }
        System.out.println("upper letters are "+upper);
        System.out.println("lower letters are "+lower);




    }
}
