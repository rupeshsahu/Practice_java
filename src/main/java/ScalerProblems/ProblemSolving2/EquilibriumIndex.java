package ScalerProblems.ProblemSolving2;

public class EquilibriumIndex {
    public static void main(String[] args) {

        int arr[]={-7,1,5,2,-4,3};
        System.out.println(solve(arr)
        );


    }
    public static int solve(int A[]){
        int index=0;

        int prefixsum[]=new int[A.length];
        prefixsum[0]=A[0];
        for(int i=1;i<prefixsum.length;i++){
            prefixsum[i]=A[i]+prefixsum[i-1];
        }
        int l= prefixsum.length-1;
        for(int i=0;i<prefixsum.length;i++){
            if(prefixsum[i]==prefixsum[prefixsum.length-1]-prefixsum[l])
            {
                index=i+1;
                break;
            }
            l--;

        }



        return index;
    }
}
