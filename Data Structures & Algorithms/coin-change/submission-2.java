class Solution {
    int[][] dp;
    public int coinChange(int[] coins, int amount) {
        int count = 0;
        dp = new int[coins.length][amount + 1];
        for (int i=0; i < dp.length; i++) Arrays.fill(dp[i], -1);
        count = countCoins(0, coins, amount);
        return (count == Integer.MAX_VALUE) ? -1 : count;
    }
    public int countCoins(int i, int[] coins, int amount) {
        if (i == coins.length) return (amount == 0) ? 0 : Integer.MAX_VALUE;
        if (dp[i][amount] != -1) return dp[i][amount];
        int skip = countCoins(i+1, coins, amount);
        if (amount < coins[i]) return dp[i][amount] = skip;
        int pick = countCoins(i, coins, amount - coins[i]);
        if (pick == Integer.MAX_VALUE) return dp[i][amount] = skip;
        return dp[i][amount] = Math.min(skip, 1 + pick);
    }
}
