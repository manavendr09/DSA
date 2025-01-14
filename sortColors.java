package DSA;

class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int h=nums.length-1;
        int temp;
        int i=0;
        while(i<=h){
         if(nums[i]==2){
            temp=nums[i];
            nums[i]=nums[h];
            nums[h]=temp;
            h--;
            }
            else if(nums[i]==0){
               temp=nums[i];
            nums[i]=nums[l];
            nums[l]=temp;
            i++;
            l++; 
            }
    else{
        i++;
    }
}
}
}