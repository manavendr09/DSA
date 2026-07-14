class Solution {
    // public int change(int amount, int[] coins) {
        
    //    int ans=0;
    //    Integer dp[][]=new Integer[coins.length][amount+1];
    //    ans = helper(coins.length-1,coins,amount,dp);
    //    return ans;
    // }
    // public int helper(int n,int[] coins,int amt,Integer[][] dp){
    //     if(n==0){
    //     if(amt%coins[0]==0){
    //         return 1;
    //     }
    //     return 0;
    //     }
    //     if(dp[n][amt]!=null) return dp[n][amt];
    //     int npick=helper(n-1,coins,amt,dp);
    //     int pick=0;
    //     if(coins[n]<=amt){
    //     pick=helper(n,coins,amt-coins[n],dp);
    //     }
    //     return dp[n][amt]=pick+npick;
    // }


    //tabulation
public int change(int amount, int[] coins) {
        int n=coins.length;
        int dp[][]=new int [n][amount+1];     
for(int i=0;i<=amount;i++){
   if( i % coins[0]==0){
    dp[0][i]=1;
   }
   else{
    dp[0][i]=0;
   }
}

for(int i=1;i<n;i++){
    for(int j=0;j<=amount;j++){
      int notpick=dp[i-1][j];
      int pick=0;
      if(j>=coins[i]){
        pick=dp[i][j-coins[i]];
      }
      dp[i][j]=pick+notpick;
    }
}
   return dp[n-1][amount];     
    }
}