class Solution {
    public boolean isValid(String s) {
        // Create a stack to store opening brackets
        Stack<Character> stack = new Stack<>();
        
        // Iterate through each character in the string
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // If the character is an opening bracket, push it onto the stack
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // If the character is a closing bracket
            else {
                // If the stack is empty, there's no corresponding opening bracket
                if(stack.isEmpty())
                    return false;
                
                // Get the top character from the stack
                char top = stack.pop();
                
                // Check if the current closing bracket matches the top opening bracket
                if((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '['))
                    return false;
            }
        }
        
        // If there are remaining opening brackets in the stack, the string is invalid
        return stack.isEmpty();
    }
}
