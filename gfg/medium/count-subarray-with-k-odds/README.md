# Count Subarrays with k Odds

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array  **arr[]**  of positive integers and an integer  **k**. You have to  **count** the number of subarrays that contain exactly k  **odd numbers**.

 **Examples:** 

```
Input: arr[] = [2, 5, 6, 9], k = 2
Output: 2
Explanation: There are 2 subarrays with 2 odds: [2, 5, 6, 9] and [5, 6, 9].
```

```
Input: arr[] = [2, 2, 5, 6, 9, 2, 11], k = 2
Output: 8
Explanation: There are 8 subarrays with 2 odds: [2, 2, 5, 6, 9], [2, 5, 6, 9], [5, 6, 9], [2, 2, 5, 6, 9, 2], [2, 5, 6, 9, 2], [5, 6, 9, 2], [6, 9, 2, 11] and [9, 2, 11].
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-03T10:34:52.556Z  

```java
class Solution {
    public int countSubarrays(int[] arr, int k) 
    {
        return count(arr, k) - count(arr, k - 1);
    }
    private static int count(int arr[], int k) 
    {
        // code here
        if (k < 0) {
            return 0;
        }
        int count = 0;
        int left = 0;
        int oddCount = 0;
       for (int right = 0; right < arr.length; right++) {
            if (arr[right] % 2 != 0) {
                oddCount++;
            }
           while (oddCount > k) {
                if (arr[left] % 2 != 0) {
                    oddCount--;
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-subarray-with-k-odds/1)