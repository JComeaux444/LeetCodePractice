package Sept5;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        // For opening brackets 
        Stack<Character> stack = new Stack<Character>();

        for ( char c : s.toCharArray() ) {
            
            if ( c == '(' || c == '[' || c == '{' ) {

                stack.push(c);

            } else { // char should be a closing bracket here
                if ( stack.isEmpty() ) return false;

                // new head/top of the string/stack
                char head = stack.peek();

                // Stack c here better be an closing bracket to match else it is not balanced
                if ( (c == ')' && head == '(') || 
                    (c == ']' && head == '[') || 
                    (c == '}' && head == '{') ){

                    stack.pop();

                } else {
                    return false;
                }
            }

        }
        // If stack is empty then all opening brackets were closed hence true, else false
        return stack.isEmpty();
        
        
    }
}