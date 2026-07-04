class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[]=new int[2];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
               ans[0]=nums[i];
            }
        }
        int x=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                x++;
            }
            else if(nums[i]>x){
                ans[1]=x;
                break;
            }
        }
        if(ans[1]==0) ans[1]=x;
        return ans;
    }
}