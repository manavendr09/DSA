class Solution {
    public int climbStairs(int n) {
        // if(n<=1) return 1;
        // int l=climbStairs(n-1);
        // int r=climbStairs(n-2);
        // return l+r;
       
        // int dp[]=new int[n+1];
        // if(n<=1) return 1;
        // if(dp[n]!=0) return dp[n];
        // return dp[n]=climbStairs(n-1)+climbStairs(n-2);
       
        // int dp[]=new int[n+1];
        // dp[0]=1;
        // dp[1]=1;
        // for(int i=2;i<=n;i++){
        //     dp[i]=dp[i-1]+dp[i-2];
        // }
        // return dp[n];

        int a=1;
        int b=1;
        if(n<=1) return 1;
        int c=0;
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
           
    }
    return c;
    }
}