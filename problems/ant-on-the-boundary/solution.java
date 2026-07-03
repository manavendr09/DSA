class Solution {
    public int returnToBoundaryCount(int[] nums) {
      int c=0;
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
            if(nums[i]==0){
                c++;
            }
        }
        
        return c;
    }
}