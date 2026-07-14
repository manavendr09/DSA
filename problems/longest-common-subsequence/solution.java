class Solution {
    // public int longestCommonSubsequence(String text1, String text2) {
    //     return lcs(text1.length()-1,text2.length()-1,text1,text2);
    // }
    // public int lcs(int n,int m,String t1,String t2){
    //      if(n<0||m<0) return 0;
    //      if(t1.charAt(n)==t2.charAt(m)) return 1+lcs(n-1,m-1,t1,t2);
    //      return Math.max(lcs(n-1,m,t1,t2),lcs(n,m-1,t1,t2));
    // }
    // public int longestCommonSubsequence(String text1, String text2) {
    //     Integer dp[][]=new Integer[text1.length()][text2.length()];
    //     return lcs(text1.length()-1,text2.length()-1,text1,text2,dp);
    // }
    // public int lcs(int n,int m,String t1,String t2,Integer[][] dp){
    //      if(n<0||m<0) return 0;
    //      if(dp[n][m]!=null) return dp[n][m];
    //      if(t1.charAt(n)==t2.charAt(m)) return dp[n][m]=1+lcs(n-1,m-1,t1,t2,dp);
    //      return dp[n][m]=Math.max(lcs(n-1,m,t1,t2,dp),lcs(n,m-1,t1,t2,dp));
    // }

    
    // public int longestCommonSubsequence(String text1, String text2) {
    //     int n=text1.length();
    //     int m=text2.length();

    //     int dp[][]=new int[text1.length()+1][text2.length()+1];
    //     dp[0][0]=0;
    //     // for(int i=0;i<=m;i++){
    //     //      dp[0][i]=0;
    //     // }
    //     // for(int i=0;i<=n;i++){
    //     //      dp[i][0]=0;
    //     // }
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=m;j++){
    //              if(text1.charAt(i-1)==text2.charAt(j-1)) 
    //              dp[i][j]=1+dp[i-1][j-1];
    //              else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
    //         }
    //     }
    //     return dp[n][m];
    // }
    
    
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();

        int prev[]=new int[m+1];
        
        for(int i=1;i<=n;i++){
            int curr[]=new int[m+1];
            for(int j=1;j<=m;j++){
                 if(text1.charAt(i-1)==text2.charAt(j-1)) 
                 curr[j]=1+prev[j-1];
                 else curr[j]=Math.max(prev[j],curr[j-1]);
            }
            prev=curr;
        }
        return prev[m];
    }
}