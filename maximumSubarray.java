package DSA;

class Solution {
    public int maxSubArray(int[] nums) {
        int ms=nums[0];
        int cs=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            cs=Math.max(nums[i],cs+nums[i]);
            ms=Math.max(cs,ms);
        }
        return ms;
    }
}

////KADANE'S ALGORITHM
