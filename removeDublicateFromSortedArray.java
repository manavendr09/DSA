package DSA;

class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i=i+1;
            }
        }
        return i+1;
    }
}