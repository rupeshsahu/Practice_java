import java.util.List;
import java.util.Stack;

public class Demo_braces {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<Character>();
        String str="{()}[]";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='('){
                s.push(str.charAt(i));
            }
            if(str.charAt(i)=='}' || str.charAt(i)==']' || str.charAt(i)==')' && !s.empty()){
                if(s.peek()==returnOpposite(str.charAt(i)) )
                    s.pop();
            }
        }
        if(s.empty()){
            System.out.println("balanced");
        }
        else System.out.println("Unbalanced");

    }

    public static char returnOpposite(char c){

        if(c=='{')
            return '}';
        else if(c=='[')
            return ']';
        else if(c=='(')
            return ')';

        if(c=='}')
            return '{';
        else if(c==']')
            return '[';
        else if(c==')')
            return '(';

        else
            return '0';


    }

}
