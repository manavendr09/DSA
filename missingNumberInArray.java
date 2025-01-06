package DSA;

class Solution {

    public int missingNumber(int[] nums) {
    int sum1=0,n=nums.length;
    int sum=(n*(n+1))/2;
    for(int i=0;i<nums.length;i++){
    sum1=sum1+nums[i];
    }
    return sum-sum1; }
    }

//     public static int missingNumber(int[] nums) {
//         int n = nums.length;
//         int xor1 = 0, xor2 = 0;
//         for (int i = 0; i < n; i++) {
//             xor2 = xor2 ^ nums[i];
//             xor1 = xor1 ^ (i + 1);
//         }
//         return xor1 ^ xor2;
//     }
// }