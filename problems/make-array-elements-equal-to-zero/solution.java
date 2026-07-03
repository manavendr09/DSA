class Solution {
    public int countValidSelections(int[] nums) {
        int r[]=new int[nums.length];
        int l[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            l[i]=nums[i];
            r[i]=nums[i];
        }
        for(int i=1;i<nums.length;i++){
            l[i]=l[i]+l[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            r[i]=r[i]+r[i+1];
        }
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
            if(l[i]==r[i]){
                c += 2;
            }
            else if(Math.abs(l[i]-r[i])==1){
                c++;
            }
            }
            else{
                continue;
            }
        }
        return c;
    }
}