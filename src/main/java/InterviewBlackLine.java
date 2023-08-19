import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class InterviewBlackLine {

    /*1. Write a simple java program to Find a Given String is Balanced or not ?
Input: str = “((()))()()”
Output: Balanced
Input: str = “())((())”
Output: Not Balanced*/

    public static void main(String[] args) {

        System.out.println(isBalanced("((()))"));
        System.out.println(isBalancedPlus("{[)]}"));



    }

    public static boolean isBalanced(String input){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='(')
                stack.push(input.charAt(i));// inserting ( into the stack
            if (stack.isEmpty())
                return false;

            else if(input.charAt(i)==')' && !stack.isEmpty())
                stack.pop();
        }
        if(stack.isEmpty())
            return true;
        return  false;
    }

    public static boolean isBalancedPlus(String input){
        Deque<Character> stack=new ArrayDeque<>();
        for(char c:input.toCharArray()){
            if(c=='(' || c=='{' || c=='[') {
                stack.push(c);
                continue;
            }


            if(stack.isEmpty())
                return false;

            char check;
            switch (c){
                case ')':
                    check=stack.pop();
                    if(check=='{'||check=='[')
                        return false;
                    break;

                case '}':
                    check=stack.pop();
                    if(check=='('||check=='[')
                        return false;
                    break;
                case ']':
                    check=stack.pop();
                    if(check=='{'||check=='(')
                        return false;
                    break;}

        }

        return stack.isEmpty();
    }
}
