class Solution {
    public void sortColors(int[] nums) {
   //  Arrays.sort(nums);
   int l=0;
   int m=0;
   int h=nums.length-1;

    while(h>=m){
     if(nums[m]==0){
        int temp=nums[m];
        nums[m]=nums[l];
        nums[l]=temp;
        l++;
        m++;
     }
     else if(nums[m]==1){
        m++;
     }     
     else{
        int temp=nums[m];
        nums[m]=nums[h];
        nums[h]=temp;
        h--;
     }

     }

    }
}