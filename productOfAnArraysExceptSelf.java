package DSA;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int a=1;
        int b=1;
        for(int i=0;i<nums.length;i++){
            ans[i]=1;
        }
        for(int j=0;j<nums.length;j++){
            ans[j] *= a;
            a *= nums[j];
        }
        for(int k=nums.length-1;k>=0;k--){
            ans[k] *= b;
            b *= nums[k];
        }
        return ans;
    }
}