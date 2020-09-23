import java.util.Stack;


public class ValidParens {


    public static void main(String[] args) {
        
        String s = "([{}])";
        System.out.println(ValidParenthesis(s));
    }

    private static Boolean ValidParenthesis(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '['|| c == '{'){
                stack.push(c);
            }
            else if(stack.peek() == '{' && c == '}'){
                stack.pop();
            }
            else if(stack.peek() == '[' && c == ']'){
                stack.pop();
            }
            else if(stack.peek() == '(' && c == ')'){
                stack.pop();
            }

        }

        if(!(stack.empty())){
            return false;
        }
        else{
            return true;
        }

    }

}