package lambda_expression;
@FunctionalInterface
public interface lambda {
    public int  m1(int a,int b );
    default void m2() {
        System.out.println("this is default method of functional interface");
    }

}
