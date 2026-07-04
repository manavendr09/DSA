class Solution {
    public int findPairs(int[] nums, int k) {
        int c=0;
        int l=0;
        int r=1;
        Arrays.sort(nums);
        while(r<nums.length){
            if(l==r||nums[r]-nums[l]<k){
                r++;
            }
            else if(nums[r]-nums[l]>k){
                l++;
                 if (l >= r) r = l + 1;
            }
            else{
                c++;
                l++;
           while (l > 0 && l < nums.length && nums[l] == nums[l - 1]) {
                 l++;
                  if (l >= r) r = l + 1;
}
            }
        }
        return c;
    }
}