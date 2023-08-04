import java.util.Stack;

public class InterviewBlackLine {

    /*1. Write a simple java program to Find a Given String is Balanced or not ?
Input: str = “((()))()()”
Output: Balanced
Input: str = “())((())”
Output: Not Balanced*/

    public static void main(String[] args) {

        System.out.println(isBalanced("((()))"));



    }

    public static boolean isBalanced(String input){



        Stack<Character> stack=new Stack<>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='(')
                stack.push(input.charAt(i));// inserting ( into the stack

            else if (stack.isEmpty())
                return false;

            else if(input.charAt(i)==')' && !stack.isEmpty())
                stack.pop();

        }
        if(stack.isEmpty())
            return true;
        return  false;
    }
}
