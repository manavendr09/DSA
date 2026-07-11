class Solution {

//  public int minFallingPathSum(int[][] matrix) {
//         int m=matrix.length;
//         int min=Integer.MAX_VALUE;
//         for(int n=0;n<matrix[0].length;n++){
//             min=Math.min(min,helper(m-1,n,matrix));
//         }
//         return min;
//     }
//     public int helper(int m,int n,int[][] matrix){
//          if(m<0||n<0||n>matrix.length-1) return Integer.MAX_VALUE;
//          if(m==0&&n==0) return matrix[m][n];
//          if(m==0) return matrix[0][n];
//          return matrix[m][n]+Math.min(helper(m-1,n,matrix),Math.min(helper(m-1,n-1,matrix),helper(m-1,n+1,matrix)));
//     


    // public int minFallingPathSum(int[][] matrix) {
    //     int m=matrix.length;
    //     int min=Integer.MAX_VALUE;
    //     Integer dp[][]=new Integer[m][m];
    //     for(int n=0;n<matrix[0].length;n++){
    //         min=Math.min(min,helper(m-1,n,matrix,dp));
    //     }
    //     return min;
    // }
    // public int helper(int m,int n,int[][] matrix,Integer[][] dp){
    //      if(m<0||n<0||n>matrix.length-1) return Integer.MAX_VALUE;
    //      if(m==0) return matrix[0][n];
    //      if(dp[m][n]!=null) return dp[m][n];
    //      return dp[m][n]=matrix[m][n]+Math.min(helper(m-1,n,matrix,dp),Math.min(helper(m-1,n-1,matrix,dp),helper(m-1,n+1,matrix,dp)));
    // }



    // public int minFallingPathSum(int[][] matrix) {
    //     int m=matrix.length;
    //     int n=matrix[0].length;
    //     int min=Integer.MAX_VALUE;
    //     int dp[][]=new int[m][n];
    //     for(int i=0;i<n;i++){
    //       dp[0][i]=matrix[0][i];
    //     }

    //     for(int i=1;i<m;i++){
    //         for(int j=0;j<n;j++){
    //            dp[i][j]=matrix[i][j]+Math.min(dp[i-1][j],
    //            Math.min((j>0)?dp[i-1][j-1]:Integer.MAX_VALUE,
    //                     (j<n-1)?dp[i-1][j+1]:Integer.MAX_VALUE));
    //         }
    //     }
    //     int ans=Integer.MAX_VALUE;
    //     for(int i=0;i<m;i++){
    //        ans= Math.min(ans,dp[m-1][i]);
    //     }
    //     return ans;
    // }



    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int min=Integer.MAX_VALUE;
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
          dp[i]=matrix[0][i];
        }

        for(int i=1;i<m;i++){
            int[] c=new int[n];
            for(int j=0;j<n;j++){
               c[j]=matrix[i][j]+Math.min(dp[j],
               Math.min((j>0)?dp[j-1]:Integer.MAX_VALUE,
                        (j<n-1)?dp[j+1]:Integer.MAX_VALUE));
            }
            dp=c;
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
           ans= Math.min(ans,dp[i]);
        }
        return ans;
    }
}