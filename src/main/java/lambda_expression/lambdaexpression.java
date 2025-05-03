package lambda_expression;

public class lambdaexpression {


    public static void main(String[] args) {
        lambda l1 = (a, b) -> a + b;

        // With braces and return
        lambda l2 = (a, b) -> { return a + b; };

        // With type declaration
        lambda l3 = (int a, int b) -> a + b;

        // Full form
        lambda l4 = (int a, int b) -> { return a + b; };




        // Output
        System.out.println(l1.m1(4, 5));
        System.out.println(l2.m1(4, 5));
        System.out.println(l3.m1(4, 5));
        System.out.println(l4.m1(4, 5));




        }



}


