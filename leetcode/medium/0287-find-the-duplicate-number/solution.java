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