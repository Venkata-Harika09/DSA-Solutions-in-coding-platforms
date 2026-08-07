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
