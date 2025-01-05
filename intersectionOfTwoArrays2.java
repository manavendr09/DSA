package DSA;

import java.util.Arrays;
//main code is bellow
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        int k=0;
         int[] ans=new int[Math.min(nums1.length,nums2.length)];
        while(i<nums1.length&&j<nums2.length){
           if(nums1[i]<nums2[j]){
            i++;
           }
           else if(nums2[j]<nums1[i]){
            j++;
           }
           else{
            // if(k==0||nums1[i]!=ans[k-1]){     //this is used when we need no repeted element
            //  ans[k++]=nums1[i];}
            ans[k++]=nums1[i];
             i++;
             j++;
           }
        }
return Arrays.copyOf(ans,k);
    }
}