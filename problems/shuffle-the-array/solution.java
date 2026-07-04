class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[nums.length];
        int j=0;
        for(int i=0;i<n;i++){
           ans[j]=nums[i];
           j+=2;
        }
        int k=1;
         for(int i=n;i<nums.length;i++){
           ans[k]=nums[i];
           k+=2;
        }
        return ans;
    }
}