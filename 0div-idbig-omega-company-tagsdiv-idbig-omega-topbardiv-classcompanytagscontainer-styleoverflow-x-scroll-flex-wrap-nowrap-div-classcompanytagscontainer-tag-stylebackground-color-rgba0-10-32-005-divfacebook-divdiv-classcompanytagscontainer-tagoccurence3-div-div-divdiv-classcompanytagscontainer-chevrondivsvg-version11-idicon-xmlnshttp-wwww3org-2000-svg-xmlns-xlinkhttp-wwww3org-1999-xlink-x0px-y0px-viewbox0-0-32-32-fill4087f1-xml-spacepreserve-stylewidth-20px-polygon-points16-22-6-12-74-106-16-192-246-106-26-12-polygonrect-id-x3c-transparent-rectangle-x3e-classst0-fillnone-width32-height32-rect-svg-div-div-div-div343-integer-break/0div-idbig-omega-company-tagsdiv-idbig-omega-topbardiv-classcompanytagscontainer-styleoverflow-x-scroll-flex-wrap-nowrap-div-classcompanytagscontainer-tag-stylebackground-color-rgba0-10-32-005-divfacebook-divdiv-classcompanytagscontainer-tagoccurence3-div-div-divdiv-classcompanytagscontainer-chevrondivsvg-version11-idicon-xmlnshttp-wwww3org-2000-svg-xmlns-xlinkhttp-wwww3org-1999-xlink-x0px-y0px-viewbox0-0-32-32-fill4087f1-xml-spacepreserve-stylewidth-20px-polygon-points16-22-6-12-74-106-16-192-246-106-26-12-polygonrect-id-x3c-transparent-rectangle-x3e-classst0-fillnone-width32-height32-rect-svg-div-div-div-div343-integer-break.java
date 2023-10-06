public class Solution {
    public int integerBreak(int n) {
        int[] result = new int[n + 1];
        result[1] = 1;
        for (int i = 2; i <= n; i ++) {
            int max = Integer.MIN_VALUE;
            for (int j = 1; j <= i/2; j ++) {
                int product = Math.max(result[j], j) * Math.max(result[i-j], i - j);
                max = Math.max(max, product);
            }
            result[i] = max;
        }
        return result[n];
    }
}