package ScalerProblems.PeoblemSolving3;

public class FindDivisors {

    public static void main(String[] args) {
        String result="";


        for(int i=1;i<Math.sqrt(30);i++){
//            if(i>30/i)
//                break;
            if(30%i==0){
                result=result+" "+i+" "+30/i;
            }

        }
        System.out.println(result);

    }
}
