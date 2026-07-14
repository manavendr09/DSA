class Solution {
    public int coinChange(int[] coins, int amount) {
       int ans=Integer.MAX_VALUE;
       ans=helper(coins.length-1,coins,amount);
       return ans==Integer.MAX_VALUE?-1:ans;
    }
    public int helper(int n,int[] coins,int amt){
        if(n==0){
        if(amt%coins[0]==0){
            return amt/coins[0];
        }
        return Integer.MAX_VALUE;
        }
        int npick=helper(n-1,coins,amt);
        int pick=Integer.MAX_VALUE;
        if(coins[n]<=amt){
        int res=helper(n,coins,amt-=coins[n]);
        if(res!=Integer.MAX_VALUE) pick=1+res;}
        return Math.min(pick,npick);
    }
}