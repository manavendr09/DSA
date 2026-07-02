class Solution {
    public int singleNumber(int[] nums) {
        Map <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int k=0;

        for(Map.Entry <Integer,Integer> e:map.entrySet()){
            if(1==e.getValue()){
                k=e.getKey();
            }
        }
        return k;
    }
}