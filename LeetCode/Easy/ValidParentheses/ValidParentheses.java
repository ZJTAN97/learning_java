import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "{[]";
        boolean ans = checkParentheses(s);
        boolean ans2 = checkParentheses(s);
        System.out.println(ans);
        System.out.println(ans2);
    }

    public static boolean checkParentheses(String s) {

        if(s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if( c == '(') stack.push(')');
            else if ( c == '[' ) stack.push(']');
            else if ( c == '{' ) stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c) return false;
            // System.out.println(stack);

        }
        return stack.isEmpty();

    }


    public static boolean checkParentheses2(String s) {
        
        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> bracketPairs = new HashMap<Character, Character>();

        bracketPairs.put(')', '(');
        bracketPairs.put(']', '[');
        bracketPairs.put('}', '{');

        for (int i=0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(stack.size() > 0 && bracketPairs.containsKey(c)){
                if (stack.peek() == bracketPairs.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return true ? stack.size() == 0 : false;


    }


}
