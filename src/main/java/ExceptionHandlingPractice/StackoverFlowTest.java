package ExceptionHandlingPractice;



public class StackoverFlowTest {
    public static void main(String[] args) throws InterruptedException {
        recursiontest();

    }

    public static void recursiontest() throws InterruptedException {
        int i=0;
        i++;
        System.out.println(i);
        Thread.sleep(2000);
        recursiontest();
    }
}
