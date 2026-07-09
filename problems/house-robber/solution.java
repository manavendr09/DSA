class Solution {
    public int rob(int[] nums) {
         return helper(nums.length-1,nums);
    }
    // public int helper(int n,int[] nums){
    //     if(n<0) return 0;
    //     if(n==0) return nums[0];
    //     int pick=nums[n]+helper(n-2,nums);
    //     int notpick=0+helper(n-1,nums);
    //     return Math.max(pick,notpick);
    // }
    public int helper(int n,int[] nums){
        if(n<0) return 0;
        if(n<=1) return nums[n];
        int pick=nums[n]+helper(n-2,nums);
        int notpick=0+helper(n-1,nums);
        return Math.max(pick,notpick);
    }


    // public int rob(int[] nums) {
    //      int dp[]=new int[nums.length+1];
    //      return helper(nums.length-1,nums,dp);

    // }
    // public int helper(int n,int[] nums,int[] dp){
    //     if(n<0) return 0;
    //     if(n==0) return nums[0];
    //     if(dp[n]!=0) return dp[n];
    //     int pick=nums[n]+helper(n-2,nums,dp);
    //     int notpick=0+helper(n-1,nums,dp);
    //     return dp[n]=Math.max(pick,notpick);
    // }
 

        // public int rob(int[] nums) {
        //  int n=nums.length;
        //  int dp[]=new int[nums.length+1];
        //  dp[0]=nums[0];
        //  if(n==1) return dp[0];
        //  dp[1]=Math.max(nums[0],nums[1]);
        //  for(int i=2;i<n;i++){
        //    dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        //  }
        //  return dp[n-1];


    //     public int rob(int[] nums) {
    //      int n=nums.length;
    //    //  int dp[]=new int[nums.length+1];
    //      int a=nums[0];
    //      if(n==1) return nums[0];
    //      int b=Math.max(nums[0],nums[1]);
    //      int c=0;
    //      for(int i=2;i<n;i++){
    //        c=Math.max(nums[i]+a,b);
    //        a=b;
    //        b=c;
    //      }
        // return b;
   // }
}
















