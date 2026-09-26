class Solution {
    public int findMinimumRemovals(List<int[]> intervalList) {
        // write your code here 
        intervalList.sort((a,b)->Integer.compare(a[1],b[1]));
        int sel=0;
        int preEnd=Integer.MIN_VALUE;
        for(int[] interval : intervalList){
            int start=interval[0];
            int end=interval[1];
            if(start >= preEnd){
                sel++;
                preEnd=end;
            }
        }
        return intervalList.size()-sel;
    }
}