class Solution {
    // public int rob(int[] nums) {
    //     int temp[]=new int[nums.length-1];
    //     if(nums.length==1) return nums[0];
    //     if(nums.length==2) return Math.max(nums[0],nums[1]);
    //     for(int i=0;i<nums.length-1;i++){
    //         temp[i]=nums[i+1];
    //     }
    //   return Math.max(helper(temp.length-1,temp),helper(nums.length-2,nums));

    // }
    // public int helper(int n,int[] nums){
    //     if(n<0) return 0;
    //     if(n==0) return nums[0];
    //     int pick=nums[n]+helper(n-2,nums);
    //     int notpick=0+helper(n-1,nums);
    //     return Math.max(pick,notpick);
    // }


    // public int rob(int[] nums) {
    //     int temp[]=new int[nums.length-1];
    //     if(nums.length==1) return nums[0];
    //     if(nums.length==2) return Math.max(nums[0],nums[1]);
    //     for(int i=0;i<nums.length-1;i++){
    //         temp[i]=nums[i+1];
    //     }
    //      int dp[]=new int[nums.length+1];
    //      int dp1[]=new int[nums.length+1];

    //      return Math.max(helper(temp.length-1,temp,dp1),
    //                      helper(nums.length-2,nums,dp));

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
        //  if(nums.length==1) return nums[0];
        //  if(nums.length==2) return Math.max(nums[0],nums[1]);
         
        //  int dp[]=new int[nums.length];
        //  dp[0]=nums[0];
        //  dp[1]=Math.max(nums[0],nums[1]);
        //  for(int i=2;i<n-1;i++){
        //    dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        //  }
        
        //  int dp1[]=new int[nums.length];
        //  dp1[0]=nums[1];
        //  dp1[1]=Math.max(nums[1],nums[2]);
        //  for(int i=2;i<n-1;i++){
        //    dp1[i]=Math.max(nums[i+1]+dp1[i-2],dp1[i-1]);
        //  }
        //  return Math.max(dp1[n-2],dp[n-2]);
        // }


        public int rob(int[] nums) {
            if(nums.length==1) return nums[0];
            if(nums.length==2) return Math.max(nums[0],nums[1]);
        return  Math.max(helper(0,nums.length-1,nums),helper(1,nums.length,nums));
        }
         
         public int helper(int s,int e,int[] nums){
         int n=nums.length;
         int a=nums[s];
         if(e-s+1==1) return nums[s];
         int b=Math.max(nums[s],nums[s+1]);
         int c=0;
         for(int i=s+2;i<e;i++){
           c=Math.max(nums[i]+a,b);
           a=b;
           b=c;
         }
         return b;
        }
}
















