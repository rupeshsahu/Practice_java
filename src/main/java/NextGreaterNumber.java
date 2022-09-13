public class NextGreaterNumber {


    public static void main(String[] args) {
        int a[]={4, 5, 2,25};
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){

                if(a[i]<a[j]){
                    System.out.println(a[i]+">"+a[j]);
                    break;

                }


            }


        }
        System.out.println(a[a.length-1]+">"+"-1");

    }
}
