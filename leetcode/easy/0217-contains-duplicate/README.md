# Contains Duplicate

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, return `true` if any value appears  **at least twice**  in the array, and return `false` if every element is distinct.

 

 **Example 1:** 

 **Input:**  nums = [1,2,3,1]

 **Output:**  true

 **Explanation:** 

The element 1 occurs at the indices 0 and 3.

 **Example 2:** 

 **Input:**  nums = [1,2,3,4]

 **Output:**  false

 **Explanation:** 

All elements are distinct.

 **Example 3:** 

 **Input:**  nums = [1,1,1,3,3,4,3,2,4,2]

 **Output:**  true

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -109 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 27 ms (beats 7.99%)  
**Memory:** 106.6 MB (beats 73.48%)  
**Submitted:** 2026-09-17T04:38:40.935Z  

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            map.put(num,map.getOrDefault(num,0)+1);
             if (map.get(num) >= 2) {
                return true;
            }
        }
        return false;
      
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/contains-duplicate/)