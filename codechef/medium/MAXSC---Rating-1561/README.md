# MAXSC - Rating 1561

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Maximum Score

You are given $N$ integer sequences $A_{1}, A_{2}, \ldots, A_{N}$.
Each of these sequences contains $N$ elements.

You should pick $N$ elements, one from each sequence; let the element picked from sequence $A_{i}$ be denoted by $E_{i}$.

For each $i \; (2 \leq i \leq N)$, the condition [ $E_{i} > E_{i-1}$ ] must hold.

Compute the maximum possible value of [ $E_{1} + E_{2} + \cdots + E_{N}.$ ]

If it is impossible to pick such elements $E_{1}, E_{2}, \ldots, E_{N}$, print $-1$ instead.

### Constraints
- 1 ≤ T ≤ 10
- 1 ≤ N ≤ 700
- 1 ≤ sum of N in all test-cases ≤ 3700
- 1 ≤ Aij ≤ 109 for each valid i, j
### Subtasks

 **Subtask #1 (18 points):**  1 ≤  **Aij**  ≤  **N**  for each valid  **i**,  **j** 

 **Subtask #2 (82 points):**  original constraints

### Sample 1:
Input
Output

```
1
3
1 2 3
4 5 6
7 8 9
```

```
18
```

### Explanation:

 **Example case 1:**  To maximise the score, pick 3 from the first row, 6 from the second row and 9 from the third row. The resulting sum is  **E1+E2+E3**  = 3+6+9 = 18.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-07T16:26:53.321Z  

```java
class Solution {
    public long solve(int n, int[][] matrix) {
        // write your code here 
        for (int i = 0; i < n; i++) {
            Arrays.sort(matrix[i]);
        }

        long sum = 0;

        // Choose the largest element from the last row
        int limit = matrix[n - 1][n - 1];
        sum += limit;

        // Process remaining rows from bottom to top
        for (int i = n - 2; i >= 0; i--) {
            int idx = lowerBound(matrix[i], limit);

            // No element smaller than limit
            if (idx == 0) {
                return -1;
            }

            limit = matrix[i][idx - 1];
            sum += limit;
        }

        return sum;
    }

    // Returns first index where arr[index] >= target
    private int lowerBound(int[] arr, int target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MAXSC)