class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char current = s.charAt(i);
            if (current == '[' || current == '(' || current == '{') {
                stack.push(current);
            } else if (current == ']' || current == '}' || current == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char corresponding = stack.pop();
                if (current == ']' && corresponding != '[') {
                    return false;
                } else if (current == '}' && corresponding != '{') {
                    return false;
                } else if (current == ')' && corresponding != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
