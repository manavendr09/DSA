class Solution {
    public int maxDigitRange(int[] nums) {
        int dr[]=new int[nums.length];
        int c=0;
        for(int i=0;i<nums.length;i++){
            int a=dif(nums[i]);
            dr[i]=a;
            if(a>c) c=a;
        }int s=0;
        for(int i=0;i<nums.length;i++){
          if(dr[i]==c) s+=nums[i];
        }
        return s;
    }
    public int dif(int n){
        int max=0,min=Integer.MAX_VALUE;
       while(n>0){
        int a=n%10;
        if(max<a) max=a;
        if(min>a) min=a;
        n=n/10;
        
       }
       return max-min;
    }
}