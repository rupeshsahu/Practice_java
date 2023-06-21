package collectoins_pratice.LIst_interface;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.PriorityBlockingQueue;

public class Stack_practice {
    public static void main(String[] args) {
        Stack stack=new Stack<String>();
        stack.push("a1");
        stack.push("a2");

        stack.push("a3   ");
        stack.push("a4");

        stack.push("a5");

        stack.push("a6");
        System.out.println(stack.pop());
        System.out.println(stack);








    }
}
