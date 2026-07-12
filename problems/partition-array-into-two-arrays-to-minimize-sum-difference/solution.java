class Solution {
    public int minimumDifference(int[] nums) {
        int total = 0;
        for (int x : nums)
            total += x;

        return helper(nums, nums.length - 1, total, 0, 0);
    }

    private int helper(int[] nums, int index, int total,
                       int currSum, int count) {

        if (index < 0) {
            if (count != nums.length / 2)
                return Integer.MAX_VALUE;

            return Math.abs(total - 2 * currSum);
        }

        int pick = helper(nums, index - 1, total,
                          currSum + nums[index], count + 1);

        int notPick = helper(nums, index - 1, total,
                             currSum, count);

        return Math.min(pick, notPick);
    }
}