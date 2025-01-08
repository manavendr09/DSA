package DSA;

class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length/2;
        int count=0;
        int cand=0;
        for (int i=0;i<nums.length;i++){
              if(count==0){
                cand=nums[i];
              }
                count += (cand==nums[i])?1:-1;
              
        }
              count=0;
              for(int j=0;j<nums.length;j++){
                if(nums[j]==cand){
                    count++;
                }
    }
    return (count>n)?cand:-1;
}
}