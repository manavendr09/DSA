class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int n:nums){
            if(min>n) min=n;
            if(max<n) max=n;
        }
        return Math.max(0,max-min-(2*k));
    }
}