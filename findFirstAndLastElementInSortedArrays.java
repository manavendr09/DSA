package DSA;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
     
        int k=nums.length-1;
        for(int i=0;i<nums.length;i++){
              if(nums[i]==target){
              final int j=i;
                          ans[0]=j;

              }
              if(nums[k]==target){
                final int a=k;
             ans[1]=k;

              }
              k--;

            }
            Arrays.sort(ans);
            return ans;
        }


    }

    ///recheak