package ScalerProblems.StringManipulation;

public class ReplaceOnlyOneCharPalindromic {

    public static void main(String[] args) {
        ReplaceOnlyOneCharPalindromic obj=new ReplaceOnlyOneCharPalindromic();
        System.out.println(obj.solve("aaaaaaaaaabaaaaaaaaa"));
        System.out.println("aaaaaaaaaabaaaaaaaaa".length());
    }




    public String solve(String A) {
        char []ch=A.toCharArray();

        int end=A.length()-1;
        int start=0;
        int mismatch=0;
        System.out.println(ch.length);

        while(start<end)
        {
            if(ch[start]!=ch[end])
                mismatch++;

            end--;
            start++;
        }

        if(mismatch==1)
            return "YES";
        if(mismatch>1)
            return "NO";

        if(mismatch==0){

            if((A.length())%2==0)
                return "NO";
            else
                return "YES";
        }
        return "YES";
    }


}
