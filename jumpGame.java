class Solution {
    public boolean canJump(int[] nums) {
     int i=0;
     int j=0;
     for(int k=0;k<nums.length;k++){
          if(j<k){
            return false;
          }
          i=k+nums[k];
       if(j<i){
        j=i;
       }
     }   
     return true;
    }
}