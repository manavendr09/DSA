class Solution {
    public int dominantIndex(int[] nums) {
        int sm=0;
        int m=0;
        int x=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>m){
                sm=m;
                m=nums[i];
                x=i;
            }
            if(nums[i]>sm&&nums[i]!=m){
                sm=nums[i];
            }
        }
        return m>=sm*2?x:-1;
    }
}