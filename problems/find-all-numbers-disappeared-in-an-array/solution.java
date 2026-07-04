class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            int idx=Math.abs(nums[i])-1;
            if(nums[idx]>0){
                nums[idx]= -nums[idx];
            }
        }
            for(int j=0;j<nums.length;j++){
                if(nums[j]>0){
                l.add(j+1);
        }
        }
        return l;
    }
}