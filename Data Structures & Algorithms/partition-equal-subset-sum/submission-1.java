class Solution {
    Boolean[][] dp;
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        if (sum % 2 != 0) return false;
        sum /= 2;

        dp = new Boolean[nums.length][sum+1];
        // Since we took Boolean array instead of boolean, the inital values are null

        return knapsack(0, nums, sum);
    }

    public boolean knapsack(int i, int[] nums, int C) {
        if (i == nums.length) return (C == 0) ? true : false;
        if (dp[i][C] != null) return dp[i][C];
        if (C < nums[i]) return dp[i][C] = knapsack(i+1, nums, C);
        return dp[i][C] = (knapsack(i+1, nums, C - nums[i]) || knapsack(i+1, nums, C));
    }
}
