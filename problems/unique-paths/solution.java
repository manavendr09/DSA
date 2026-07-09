class Solution {
    // public int uniquePaths(int m, int n) {
    //     if(m==1||n==1) return 1;
    //     return uniquePaths(m-1,n)+uniquePaths(m,n-1);
    // }

    // public int uniquePaths(int m, int n) {
    //     int dp[][]=new int[m+1][n+1];
    //     return helper(m,n,dp);
    // }
    // public int helper(int m,int n,int[][] dp){
    //      if(m==1||n==1) return 1;
    //      if(dp[m][n]!=0) return dp[m][n]; 
    //      return dp[m][n]=helper(m-1,n,dp)+helper(m,n-1,dp);
    // }

    // public int uniquePaths(int m, int n) {
    //     int dp[][]=new int[m][n];
    //     for(int i=0;i<m;i++){
    //         dp[i][0]=1;
    //     }
    //         for(int j=0;j<n;j++){
    //              dp[0][j]=1;
    //         }
        
    //     for(int i=1;i<m;i++){
    //         for(int j=1;j<n;j++){
    //            dp[i][j]=dp[i-1][j]+dp[i][j-1];
    //         }
    //     }

    //     return dp[m-1][n-1];
    // }

    public int uniquePaths(int m, int n) {
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
               dp[j]=dp[j]+dp[j-1];
            }
        }

        return dp[n-1];
    }
}