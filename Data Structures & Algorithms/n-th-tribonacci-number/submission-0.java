class Solution {
    int[] dp;
    public int tribonacci(int n) {
        if (n <= 1) return n;
        if (n == 2) return 1;
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        return tri(n);
    }
    public int tri(int n) {
        if (dp[n] != -1) return dp[n];
        return dp[n] = tri(n-1) + tri(n-2) + tri(n-3);
    }
}