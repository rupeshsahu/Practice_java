package ScalerProblems.StringManipulation;

public class reverseSentenceOrderN {
    public static void main(String[] args) {
        String str="My name is rupesh";
        char arr_char[]=str.toCharArray();

//        reverseWord(str);

        System.out.println(reverseWord(str));




            }

            public static String reverseWord(String str){

        char []ch=str.toCharArray();

        reverseString(ch,0,str.length()-1);
        int start=0;
        int end=0;

        for(int i=0;i<ch.length;i++){
            if(ch[i]==' ') {
                end = i - 1;
                reverseString(ch, start, end);
                start = i + 1;
            }

        }
                 end=ch.length-1;
                reverseString(ch, start, end);








        return new String(ch);



            }





    public static void reverseString(char[] ch,int start,int end){

        //int start=0;

        for(int i=start;i<=end;i++){
            char temp=ch[i];
            ch[i]=ch[end];
            ch[end]=temp;
            end--;
        }

    }
}
