class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        if (sum % 2 != 0) return false;
        sum /= 2;
        return knapsack(0, nums, sum);
    }

    public boolean knapsack(int i, int[] nums, int C) {
        if (i == nums.length) return C == 0 ? true : false;
        if (C < nums[i]) return knapsack(i+1, nums, C);
        return knapsack(i+1, nums, C - nums[i]) || knapsack(i+1, nums, C);
    }
}
