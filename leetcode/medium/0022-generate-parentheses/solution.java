class Solution {

    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        Stack<Character> stack = new Stack<>();

        generate(result, stack, 0, 0, n);

        return result;
    }

    private void generate(List<String> result,
                          Stack<Character> stack,
                          int open,
                          int close,
                          int n) {

        // Complete combination
        if (stack.size() == 2 * n) {
            StringBuilder sb = new StringBuilder();

            for (char ch : stack) {
                sb.append(ch);
            }

            result.add(sb.toString());
            return;
        }

        // Choice 1: add '('
        if (open < n) {

            stack.push('(');

            generate(result, stack, open + 1, close, n);

            stack.pop();   // backtrack
        }

        // Choice 2: add ')'
        if (close < open) {

            stack.push(')');

            generate(result, stack, open, close + 1, n);

            stack.pop();   // backtrack
        }
    }
}