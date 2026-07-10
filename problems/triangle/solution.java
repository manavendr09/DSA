class Solution {
    // public int minimumTotal(List<List<Integer>> triangle) {
    //  return  helper(0,0,triangle);
    // }
    // public int helper(int i,int j,List<List<Integer>> triangle){
    //     if(i==triangle.size()||j==triangle.size()) return 0;
    //     return triangle.get(i).get(j)+Math.min(helper(i+1,j,triangle),helper(i+1,j+1,triangle));
    // }


    // public int minimumTotal(List<List<Integer>> triangle) {
    //     int dp[][]=new int[triangle.size()][triangle.size()];
    //     return  helper(0,0,triangle,dp);
    // }
    // public int helper(int i,int j,List<List<Integer>> triangle,int[][] dp){
        
    //     if(i==triangle.size()||j==triangle.size()) return 0;
    //     if(dp[i][j]!=0) return dp[i][j];
    //     return dp[i][j]=triangle.get(i).get(j)+Math.min(helper(i+1,j,triangle,dp),helper(i+1,j+1,triangle,dp));
    // }


    // public int minimumTotal(List<List<Integer>> triangle) {
    //     int dp[][]=new int[triangle.size()][triangle.size()];
     
    //     dp[0][0]=triangle.get(0).get(0);

    //     if(triangle.size()==1) return triangle.get(0).get(0);

    //     // for(int i=1;i<triangle.size();i++){
    //     //     dp[i][0]=dp[i-1][0]+triangle.get(i).get(0);
    //     // }
    //     // for(int j=1;j<triangle.size();j++){
    //     //     dp[j][j]=dp[j-1][j-1]+triangle.get(j).get(j);
    //     // }
        
    //     for(int i=1;i<triangle.size();i++){
    //         for(int j=0;j<=i;j++){
                
    //             if(j==0) dp[i][0]=dp[i-1][0]+triangle.get(i).get(0);
               
    //             else if(i==j) 
    //             dp[i][j]=dp[i-1][j-1]+triangle.get(i).get(j);
             
    //             else
    //             dp[i][j]=triangle.get(i).get(j)+Math.min(dp[i-1][j],dp[i-1][j-1]);
    //         }
    //     }
    //     int ans = Integer.MAX_VALUE;
    //     for (int j=0;j<triangle.size();j++) {
    //     ans = Math.min(ans, dp[triangle.size()-1][j]);
    //     }
    //     return  ans;
    // }

     public int minimumTotal(List<List<Integer>> triangle) {
        int dp[]=new int[triangle.size()];
     
        dp[0]=triangle.get(0).get(0);

        if(triangle.size()==1) return triangle.get(0).get(0);
        
        for(int i=1;i<triangle.size();i++){
        
                dp[i]=dp[i-1]+triangle.get(i).get(i);
        
                for(int j=i-1; j >= 1; j--) {
                   dp[j] = triangle.get(i).get(j)
                    + Math.min(dp[j],dp[j-1]);
        }
           dp[0]+=triangle.get(i).get(0);
            }
        int ans = Integer.MAX_VALUE;
        for(int x:dp) {
        ans = Math.min(ans,x);
        }
        return  ans;
    }
}