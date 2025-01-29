package DSA;

class Solution {
    public int jump(int[] nums) {
     int i=0;
     int j=0;
     int count=0;
     while(j<nums.length-1){
        int f=0;
        for(int k=i;k<=j;k++){
            f=Math.max(k+nums[k],f);
        } 
        i=j+1;
        j=f;
        count++;
     } 
     return count;
    }
}