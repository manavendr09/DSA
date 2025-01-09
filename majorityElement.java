package DSA;

class Solution {
  public int majorityElement(int[] nums) {
      int n=nums.length/2;
      int count=0;
      int cand=0;
      for (int i=0;i<nums.length;i++){
            if(count==0){
              count=1;
              cand=nums[i];
            }
            else if(cand==nums[i])  count++;
            else count--;
      }
        int  count1=0;
            for(int j=0;j<nums.length;j++){
              if(nums[j]==cand){
                  count1++;
              }
  }
  return (count1>n)?cand:-1;
}
}


///// MOORE'S VOTING ALGORITHM