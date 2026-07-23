class Solution {
    public boolean isGood(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>x) x=nums[i];
        }
        return x+1==nums.length;
    }
}