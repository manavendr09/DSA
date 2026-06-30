class Solution {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    List<Integer> t=new ArrayList<>();
                    t.add(i);
                    t.add(j);
                    l.add(t);
                }
                }
        }
        for(int i=0;i<l.size();i++){
            int r=l.get(i).get(0);
            int c=l.get(i).get(1);
            for(int j=0;j<matrix[0].length;j++){
                matrix[r][j]=0;
            }
            for(int k=0;k<matrix.length;k++){
                matrix[k][c]=0;
            }
        }
        return;
    }
}