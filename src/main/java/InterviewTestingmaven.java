public class InterviewTestingmaven {

    /*[3:35 PM] Kunj  Vegada

String input = aaaabbcccd

String output = a4b2c3d1
*/

    public static void main(String[] args) {

        System.out.println(charCount("aaaabbcccd"));

    }

    public static String charCount(String input){
        String result="";
        int count=1;
        char[] arr=input.toCharArray();
        for(int i=0;arr[i]!='\0';i++){

            if(arr[i]==arr[i+1]){
                count++;
            }
            else
            {
                result=result+arr[i];
                result=result+count;
                count=1;
            }

        }
        return result;

    }


}
