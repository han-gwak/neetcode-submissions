class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> results = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        generateParenthesis(0, 0, n, results, sb);
        return results;
    }

    public void generateParenthesis(int openCount, int closedCount, int n, List<String> results, StringBuilder sb) {
        // base case: open parens == closed parens == n
        if (openCount == closedCount && openCount == n) {
            results.add(sb.toString());
            return;
        }
        
        // generate left paren first
        if (openCount < n) {
            sb.append('(');
            generateParenthesis(openCount + 1, closedCount, n, results, sb);
            // backtrack last result
            sb.deleteCharAt(sb.length() - 1);
        }
        // generate right parens
        if (closedCount < openCount) {
            sb.append(')');
            generateParenthesis(openCount, closedCount + 1, n, results, sb);
            // backtrack last result
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
