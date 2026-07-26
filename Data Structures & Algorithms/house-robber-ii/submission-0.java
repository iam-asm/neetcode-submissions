class Solution {
    int[] dp;
    public int rob(int[] nums) {
        dp = new int[nums.length];
        int n = nums.length;
        if (n == 1) return nums[0];

        Arrays.fill(dp, -1);
        int loot1 = loot(nums, 0, n-2);
        Arrays.fill(dp, -1);
        int loot2 = loot(nums, 1, n-1);

        return Math.max(loot1, loot2);
    }
    public int loot(int[] nums, int left, int right) {
        if (left > right) return 0;
        if (dp[left] != -1) return dp[left];
        return dp[left] = Math.max(nums[left] + loot(nums, left+2, right), loot(nums, left+1, right));
    }
}
