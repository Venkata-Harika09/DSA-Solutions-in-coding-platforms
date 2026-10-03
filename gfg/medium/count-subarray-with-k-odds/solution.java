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
