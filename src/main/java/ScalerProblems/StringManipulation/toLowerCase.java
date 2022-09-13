package ScalerProblems.StringManipulation;

public class toLowerCase {
    public static void main(String[] args) {
        String A="Sc###ALeR";
        char arr[]=A.toCharArray();
        for(int i=0;i<arr.length;i++){
            if((int)arr[i]>=65 && (int)arr[i]<=90){
                arr[i]=(char)((int)arr[i]-65+97);
            }
        }
        System.out.println(String.valueOf(arr));

    }
}
