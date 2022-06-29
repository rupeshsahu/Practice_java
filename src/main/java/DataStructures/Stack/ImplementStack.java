package DataStructures.Stack;

public class ImplementStack {

    public static void main(String[] args) {
        StackArray sa=new StackArray(10);
        sa.push(1);
        sa.push(2);
        sa.push(3);
        sa.push(4);
        sa.push(5);
        System.out.println(sa.peek());
        System.out.println(sa.pop());
        System.out.println(sa.pop());
        sa.push(8);
        sa.push(9);
        System.out.println(sa.peek());
        sa.pop();
        sa.pop();
        sa.pop();
        sa.pop();
        sa.pop();


    }
}
