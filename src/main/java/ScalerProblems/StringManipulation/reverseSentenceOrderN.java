package ScalerProblems.StringManipulation;

public class reverseSentenceOrderN {
    public static void main(String[] args) {
        String str="My name is rupesh";
        char arr_char[]=str.toCharArray();

        reverseWord(arr_char);

        System.out.println(String.valueOf(arr_char));




            }

            public static void reverseWord(char []s){
            reverse(s,0,s.length-1);
            int st=0;
            for(int i=0;i<s.length;i++){
                if(s[i]==' '){
                    reverse(s,st,i-1);
                    st=i+1;
                }

            }
            reverse(s,st,s.length-1);


            }





    public static void reverse(char arr[],int start,int end){


        while(start<end)
        {
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }

    }
}
