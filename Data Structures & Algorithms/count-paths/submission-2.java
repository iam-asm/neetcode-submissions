class Solution {
    public int uniquePaths(int m, int n) {
        // Tabulation with space optimisation
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int j=0; j < m-1; j++) {
            for (int i=1; i < n; i++) {
                dp[i] += dp[i-1];
            }
        }
        return dp[n-1];
    }
}
