package _11_Stackk;

import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                // If stack is empty when expecting to pop → invalid
                if (s.isEmpty()) {
                    return false;
                }
                
                char top = s.peek();
                if ((top == '(' && ch == ')') || 
                    (top == '{' && ch == '}') || 
                    (top == '[' && ch == ']')) {
                    s.pop(); // Match found → pop it
                } else {
                    return false; // Mismatched bracket
                }
            }
        }
        
        // If stack is empty at the end → all brackets matched
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String str = "(())";
        System.out.println("Is the string valid? " + isValid(str));
    }
}
