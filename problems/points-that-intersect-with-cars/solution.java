class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        // int min=Integer.MAX_VALUE;
        // int max=0;
        // for(int i=0;i<nums.size();i++){
        //    if(min>nums.get(i).get(0)){
        //     min=nums.get(i).get(0);
        //    }
        //    if(max<nums.get(i).get(1)){
        //     max=nums.get(i).get(1);
        //    }
        // }
        int a[]=new int[101];

        for(int i=0;i<nums.size();i++){
             for(int j=nums.get(i).get(0);j<=nums.get(i).get(1);j++){
                a[j]=1;
             }
        }
          int c=0;
          for(int i=1;i<101;i++){
            if(a[i]!=0){
                c++;
            }
          }
          return c;
    }
}