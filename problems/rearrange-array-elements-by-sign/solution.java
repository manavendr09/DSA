class Solution {
    public int[] rearrangeArray(int[] nums) {
        // ArrayList p=new ArrayList<>();
        // ArrayList n=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>0){
        //         p.add(nums[i]);
        //     }
        //     else{
        //         n.add(nums[i]);
        //     }
        // }
        // int a=0;
        // int ans[]=new int[nums.length];
        // for(int i=0;i<nums.length;i+=2){
        //     ans[i]=(int)p.get(a);
        //     ans[i+1]=(int)n.get(a);
        //     a++;
        // }
            int p=0;
            int n=1;
         int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(p<nums.length&&nums[i]>0){
                ans[p]=nums[i];
                p=p+2;
            }
            else if(n<nums.length&&nums[i]<0){
                ans[n]=nums[i];
                n =n+2;
            }
        }
        return ans;
    }
}