public class BlacklineInterview {
    public static void main(String[] args) {


        /*String s = "2hgfs67hsdgbs4jsj"*/

        fileterString("2hgfs67hsdgbs4jsj");
        System.out.println((int)'a');


    }

    public static void fileterString(String input){


        char arr[]=input.toCharArray();
        int evenSum=0;
        int oddSum=0;
        for (int i=0;i<arr.length;i++) {
            Boolean checkLetters = (int) arr[i] >= 97 && (int) arr[i] <= 122;

            if (!checkLetters) {

                if (Integer.parseInt(String.valueOf(arr[i])) % 2 == 0) {
                    evenSum = evenSum + Integer.parseInt(String.valueOf(arr[i]));
                } else
                    oddSum = oddSum + Integer.parseInt(String.valueOf(arr[i]));
            }
        }
        System.out.println("evenSum:- "+evenSum+" oddSum:- "+oddSum);

    }
}
