class Solution {
    public int min(int a, int b, int c){
        if(a<=b && a<=c) return a;
        if(b<=a && b<=c) return b;
        return c;
    }
    public int minDistance(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        char first[] = word1.toCharArray();
        char second[] = word2.toCharArray();
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<=n;i++) dp[i][0] = i;
        for(int i=0;i<=m;i++) dp[0][i] = i;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(first[i-1] == second[j-1]) dp[i][j] = dp[i-1][j-1];
                else dp[i][j] = 1 + min(dp[i-1][j-1], dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
}