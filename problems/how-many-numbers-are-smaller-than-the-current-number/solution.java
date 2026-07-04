class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // int n=nums.length;
        // int ans[]=new int[n];
        // for(int i=0;i<n;i++){
        //     int c=0;
        //     for(int j=0;j<n;j++){
        //         if(nums[i]>nums[j]){
        //             c++;
        //         }
        //     }
        //     ans[i]=c;
        // }
        // return ans;
        int[] freq=new int[101];
        for(int num:nums) {
            freq[num]++;
        }
        for(int i=1;i<=100;i++) {
            freq[i]+=freq[i-1];
        }
        int[] ans = new int[nums.length];
        for (int i=0;i<nums.length;i++) {
            if(nums[i]==0)
                ans[i]=0;
            else
                ans[i]=freq[nums[i]-1];
        }

        return ans;
    }
}