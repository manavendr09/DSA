class Solution {

    // public int minPathSum(int[][] grid) {
    //      int m=grid.length;
    //      int n=grid[0].length;
         
    //     return helper(m-1,n-1,grid);
    //     }
    //      public int helper(int m,int n,int[][] grid){
    //         if(m==0&&n==0) return grid[0][0];
    //         if(m<0||n<0) return Integer.MAX_VALUE;
    //      return   grid[m][n] + Math.min(helper(m-1,n,grid),helper(m,n-1,grid));
    //          }



    // public int minPathSum(int[][] grid) {
    //      int m=grid.length;
    //      int n=grid[0].length;
    //      int dp[][]=new int[m][n];
    //     return helper(m-1,n-1,grid,dp);
    //     }
    //      public int helper(int m,int n,int[][] grid,int[][] dp){
    //         if(m==0&&n==0) return grid[0][0];
    //         if(m<0||n<0) return Integer.MAX_VALUE;
    //         if(dp[m][n]!=0) return dp[m][n];
    //      return  dp[m][n]= grid[m][n] + Math.min(helper(m-1,n,grid,dp),helper(m,n-1,grid,dp));
    //          }

    // public int minPathSum(int[][] grid) {
    //      int m=grid.length;
    //      int n=grid[0].length;
    //      int dp[][]=new int[m][n];
    //      dp[0][0]=grid[0][0];
    //      for(int i=1;i<m;i++){
    //          dp[i][0]=dp[i-1][0]+grid[i][0];
    //      }
    //      for(int j=1;j<n;j++){
    //         dp[0][j]=dp[0][j-1]+grid[0][j];
    //      }
    //      for(int i=1;i<m;i++){
    //         for(int j=1;j<n;j++){
    //             dp[i][j]=grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
    //         }
    //      }
    //     return dp[m-1][n-1];
    //     }
        


        public int minPathSum(int[][] grid) {
         int m=grid.length;
         int n=grid[0].length;
         int dp[]=new int[n];
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if( i==0&&j==0){
                     dp[0]=grid[0][0];
                }
                else if(j==0){
                    dp[j]=dp[0]+grid[i][0];
                }
                else if(i==0){
                    dp[j]=dp[j-1]+grid[0][j];
                }
                else{
                dp[j]=grid[i][j]+Math.min(dp[j],dp[j-1]);
            }}
         }
        return dp[n-1];
        }
}