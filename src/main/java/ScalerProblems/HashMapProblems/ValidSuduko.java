package ScalerProblems.HashMapProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidSuduko {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("53..7....");
        l.add("6..195...");
        l.add(".98....6.");
        l.add("8...6...3");
        l.add("4..8.3..1");
        l.add("7...2...6");
        l.add(".6....28.");
        l.add("...419..5");
        l.add("....8..79");

       // System.out.println(l.get(0).charAt(0));

        System.out.println(isValidSudoku(l));

    }

    public static int isValidSudoku(final List<String> A){

        Set<String> hs=new HashSet<>();

        for(int i=0;i<A.size();i++){
            for(int j=0;j<A.get(0).length();j++){

                if(A.get(i).charAt(j)!='.'){
                    if(!hs.add("row"+i+A.get(i).charAt(j)) || !hs.add("col"+j+A.get(i).charAt(j)) || !hs.add("box"+(((i/3)*3+(j/3)))+A.get(i).charAt(j)) )
                        return 0;


                }


            }
        }
        return 1;

    }
}
