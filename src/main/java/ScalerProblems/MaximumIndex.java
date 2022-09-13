package ScalerProblems;

public class MaximumIndex {

    public static void main(String[] args) {
        System.out.println(maximumIndex(3,2));
    }

    public static int maximumIndex(int N,
                             int B)
    {
        int max_index = 0;
        for (int i = 1; i <= N; i++)
        {
            max_index += i;
        }

        int current_index = max_index,
                step = N;

        while (true)
        {

            while (current_index > 0 &&
                    N > 0)
            {

                current_index -= N;


                if (current_index == B)
                {

                    current_index += N;
                }


                N--;
            }


            if (current_index <= 0)
            {

                //System.out.print(max_index + "\n");
                break;
            }


            else
            {
                N = step;


                current_index = max_index - 1;


                max_index--;


                if (current_index == B)
                {
                    current_index = max_index - 1;


                    max_index--;
                }
            }
        }
        return max_index;
    }
}
