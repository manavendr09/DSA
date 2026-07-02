class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int p =-1, q =-1;
        for (int i=0;i<n-1;i++) {
            if (nums[i]<nums[i+1]) {
                continue;
            } else if(nums[i]>nums[i+1]) {
                p=i;
                break;
            } else {
                return false; 
            }
        }

        if (p<=0) return false;

        for (int i= p;i<n-1;i++) {
            if (nums[i]>nums[i+1]) {
                continue;
            } else if(nums[i]<nums[i+1]) {
                q=i;
                break;
            } else {
                return false;
            }
        }

        if (q==-1||q==p||q==n-1) return false;

        for(int i=q;i<n-1;i++) {
            if (nums[i]>=nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
}