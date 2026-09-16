# Generate Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given `n` pairs of parentheses, write a function to  *generate all combinations of well-formed parentheses*.

 

 **Example 1:** 

```
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]

```

 **Example 2:** 

```
Input: n = 1
Output: ["()"]

```

 

 **Constraints:** 

- 1 <= n <= 8

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 69.43%)  
**Memory:** 44.5 MB (beats 64.23%)  
**Submitted:** 2026-09-16T06:27:44.583Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/generate-parentheses/)