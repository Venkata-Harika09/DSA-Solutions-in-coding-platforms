# Find the Duplicate Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive.

There is only  **one repeated number**  in `nums`, return  *this repeated number*.

You must solve the problem  **without**  modifying the array `nums` and using only constant extra space.

 

 **Example 1:** 

```
Input: nums = [1,3,4,2,2]
Output: 2

```

 **Example 2:** 

```
Input: nums = [3,1,3,4,2]
Output: 3

```

 **Example 3:** 

```
Input: nums = [3,3,3,3,3]
Output: 3
```

 

 **Constraints:** 

- 1 <= n <= 105
- nums.length == n + 1
- 1 <= nums[i] <= n
- All the integers in nums appear only once except for precisely one integer which appears two or more times.

 

 **Follow up:** 

- How can we prove that at least one duplicate number must exist in nums?
- Can you solve the problem in linear runtime complexity?

## Solution

**Language:** Java  
**Runtime:** 26 ms (beats 19.35%)  
**Memory:** 91.9 MB (beats 13.17%)  
**Submitted:** 2026-09-16T06:28:45.282Z  

```java
class Solution {
    public int findDuplicate(int[] nums) {
      LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
      for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            return nums[i];
        }
        map.put(nums[i],1);
      }
      return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-the-duplicate-number/)