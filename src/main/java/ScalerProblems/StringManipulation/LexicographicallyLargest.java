package ScalerProblems.StringManipulation;

public class LexicographicallyLargest {


    public static void main(String[] args) {
        LexicographicallyLargest obj=new LexicographicallyLargest();
        System.out.println(obj.getLargest("ittmcsvmoa_jktvvblefw"));
//        System.out.println((int)'a');


    }
    public String getLargest(String A) {
        String []str1=A.split("_");
        String s1=str1[0];
        String s2=str1[1];
        int[]arr=new int[26];
        for(int i=0;i<26;i++){
            arr[i]=0;
        }
        for(int i=0;i<s2.length();i++)
            arr[(int)s2.charAt(i)-(int)'a']++;
        String srted_str="";
        for(int i=25;i>=0;i--){
            if(arr[i]==0)
                continue;
            int count=0;
            while(count<arr[i]) {
                srted_str = srted_str+(char)(i+'a');
                count++;
            }

        }


        char arr1[]=s1.toCharArray();
        char arr2[]=srted_str.toCharArray();
        //char arr2[]=s1.toCharArray();


        for(int i=0;i<arr2.length;i++){
            for(int j=i;j<arr1.length;j++){
                if(arr2[i]>arr1[j])
                {
                    arr1[j]=arr2[i];
                    break;
                }
            }

        }


return new String(arr1);
    }
}
