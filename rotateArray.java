package DSA;

class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        k=k%len;
       int k1=len-k;
        reverse(nums,0,k1-1);
        reverse(nums,k1,len-1);
        reverse(nums,0,len-1);
    }
  void reverse(int[] nums,int a,int b){
        int temp;
        while(b>a){
            temp=nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
            a++;
            b--;
        }
    }
}