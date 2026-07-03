class Solution {
    public int[] separateDigits(int[] nums) {
       List <Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            Stack <Integer> s=new Stack<>();
            while(nums[i]>0){
                s.push(nums[i]%10);
                nums[i]=nums[i]/10;
            }
            while(!s.isEmpty()){
                l.add(s.pop());
            }
        }
        int[] arr = new int[l.size()];
         for(int i=0;i<l.size(); i++) {
         arr[i]=l.get(i);
}
        return arr;
    }
}