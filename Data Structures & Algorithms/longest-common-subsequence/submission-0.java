class Solution {
    public int longestCommonSubsequence(String x, String y) {
        int n = x.length();
        int m = y.length();
        int[][] dp = new int[n][m];

        for (int i=0; i < n; i++) {
            for (int j=0; j < m; j++) {
                if (x.charAt(i) == y.charAt(j))
                    dp[i][j] = 1 + ((i>0 && j>0) ? dp[i-1][j-1] : 0);
                else
                    dp[i][j] = Math.max((i>0) ? dp[i-1][j] : 0, (j>0) ? dp[i][j-1] : 0);
            }
        }
        return dp[n-1][m-1];
    }
}
