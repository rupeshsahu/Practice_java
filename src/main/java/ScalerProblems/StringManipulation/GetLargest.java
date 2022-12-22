package ScalerProblems.StringManipulation;

public class GetLargest {

    public static void main(String[] args) {
        GetLargest obj=new GetLargest();

        System.out.println(obj.getLargest("ittmcsvmoa_jktvvblefw"));


    }



    public String getLargest(String A) {
        String []str1=A.split("_");
        String s1=str1[0];
        String s2=str1[1];

        char arr1[]=s2.toCharArray();
        char arr2[]=s1.toCharArray();


        for(int i=0;i<arr1.length;i++){
            for(int j=i;j<arr2.length;j++){
                if(arr1[i]>arr2[j])
                {
                    arr2[j]=arr1[i];
                    break;
                }
            }

        }


        return new String(arr2);
    }
}
