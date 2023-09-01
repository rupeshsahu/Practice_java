

import java.util.*;

public class PersistentInterview {
    /*
    * Api automation api api api*/
    public static void main(String[] args) {
        mostRepeatedWord("Api automation automation automation automation automation api api api Api Api Api");

        /*int arr[]={1,2,3,4,5};
        System.out.println(thirdLargest(arr));
*/

    }
    public  static void mostRepeatedWord(String str){

        String words[]=str.split(" ");
    ;
        Map<String,Integer> wordFrequecy =new HashMap<>();
        Integer max=Integer.MIN_VALUE;

        for(int i=0;i<words.length;i++){
            wordFrequecy.put(words[i],wordFrequecy.getOrDefault(words[i],0)+1);
            Integer value=wordFrequecy.get(words[i]);
            max=Math.max(value,max);
        }

        for (int i=0;i<wordFrequecy.size();i++){
            if(wordFrequecy.get(words[i])==max){
                System.out.println(words[i]);
                break;

            }
        }



    }

    public  static int thirdLargest(int[] arr){
        int firstMax=0;
        int secoundMax=0;
        int thirdMax=0;
        for (int i=2;i<arr.length;i++){
            firstMax=Math.max(firstMax,arr[i]);
            if(arr[i-1]<firstMax && arr[i-1]!=firstMax) {
                secoundMax = Math.max(secoundMax, arr[i - 1]);

                if(arr[i-2]<secoundMax && arr[i-2]!=firstMax && arr[i-2]!= secoundMax)
                    thirdMax=Math.max(thirdMax,arr[i-2]);

            }

        }


        return thirdMax;
    }

}
