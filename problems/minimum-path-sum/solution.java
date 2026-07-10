class Solution {
    public int minPathSum(int[][] grid) {
         int m=grid.length;
         int n=grid[0].length;
         
        return helper(m-1,n-1,grid);
        }
         public int helper(int m,int n,int[][] grid){
            if(m==0&&n==0) return grid[0][0];
            if(m<0||n<0) return Integer.MAX_VALUE;
         return   grid[m][n] + Math.min(helper(m-1,n,grid),helper(m,n-1,grid));
             }
}