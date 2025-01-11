package DSA;

class Solution {
    public int maxProfit(int[] prices) {
        int m=0;
        int s=prices[0];
        for(int i=1;i<prices.length;i++){
             if(s >prices[i])  s=prices[i];
             else m = Math.max(m,prices[i]-s);
             
        }
        return m;
    }
}