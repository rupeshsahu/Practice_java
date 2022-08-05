package collectoins_pratice;

import java.util.Stack;

public class Stack_Class {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push('A');
        s.push('B');
        s.push('C');
        System.out.println(s);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.search('A'));
        System.out.println(s.empty());

    }
}
