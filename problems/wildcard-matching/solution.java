class Solution {
    public boolean isMatch(String s, String p) {
        int n=s.length();
        int m=p.length();
        Integer dp[][]=new Integer[n+1][m+1];
      return helper(n-1,m-1,s,p,dp)==1;
    }
    public int  helper(int n,int m,String s,String p,Integer dp[][]){
        if(n<0&&m<0) return 1;
        if(m<0&&n>=0) return 0;
        if(n<0&&m>=0){
            for(int i=0;i<=m;i++){
                if(p.charAt(i)!='*') return 0;
            }
            return 1;
        }
        if(dp[n][m]!=null) return dp[n][m];
        if(s.charAt(n)==p.charAt(m)||p.charAt(m)=='?'){
           return dp[n][m]=helper(n-1,m-1,s,p,dp);
        }
       else if(p.charAt(m)=='*'){
            return dp[n][m]=Math.max(helper(n-1,m,s,p,dp),helper(n,m-1,s,p,dp));
        }
       else return 0;
    }
}