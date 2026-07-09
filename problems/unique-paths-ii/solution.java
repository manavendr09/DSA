class Solution {
    // public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    //     int m=obstacleGrid.length;
    //     int n=obstacleGrid[0].length;
    //     return helper(m-1,n-1,obstacleGrid);
    // }
    // public int helper(int m,int n,int[][] obstacleGrid){
    //     if(m<0||n<0) return 0;
    //     if(obstacleGrid[m][n]==1) return 0;
    //     if(m==0&&n==0) return 1;

    //     return helper(m-1,n,obstacleGrid)+helper(m,n-1,obstacleGrid);
    // }

    // public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    //     int m=obstacleGrid.length;
    //     int n=obstacleGrid[0].length;
    //     int dp[][]=new int[m][n];
    //     return helper(m-1,n-1,obstacleGrid,dp);
    // }
    // public int helper(int m,int n,int[][] obstacleGrid,int[][] dp){
    //     if(m<0||n<0) return 0;
    //     if(obstacleGrid[m][n]==1) return 0;
    //     if(m==0&&n==0) return 1;
    //     if(dp[m][n]!=0) return dp[m][n];
    //     return dp[m][n]=helper(m-1,n,obstacleGrid,dp)+helper(m,n-1,obstacleGrid,dp);
    // }

    //  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    //     int m=obstacleGrid.length;
    //     int n=obstacleGrid[0].length;
    //     int dp[][]=new int[m][n];
    //     if(obstacleGrid[0][0]==1)  return 0;
    //     dp[0][0]=1;
    //     for(int i=1;i<m;i++){  if(obstacleGrid[i][0]==0) dp[i][0]=dp[i-1][0]; }
    //     for(int j=1;j<n;j++){  if(obstacleGrid[0][j]==0) dp[0][j]=dp[0][j-1]; }
    //     for(int i=1;i<m;i++){
    //         for(int j=1;j<n;j++){
    //             if(obstacleGrid[i][j]==0)
    //             dp[i][j]=dp[i-1][j]+dp[i][j-1];
    //         }
    //     }
    //     return dp[m-1][n-1];
    // }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[]=new int[n];
        if(obstacleGrid[0][0]==1)  return 0;
        dp[0]=obstacleGrid[0][0]==1?0:1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(j>0&&obstacleGrid[i][j]==0)
                dp[j]=dp[j]+dp[j-1];
                else if(obstacleGrid[i][j]==1)
                dp[j]=0;
            }
        }
        return dp[n-1];
    }
}