class Solution {
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
                int mn=Integer.MAX_VALUE;
                for(int k=0;k<n;k++){
                    if(k!=j){
                        mn=Math.min(mn,dp[k]);
                    }
                }
                c[j]=matrix[i][j]+mn;
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