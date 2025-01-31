package strings;

import java.util.Arrays;

public class LongestCommonSubsequence {

    public static int findLCSLength(String x, String y) {
        int m = x.length();
        int n = y.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        for(int[] a:dp) {
        	System.out.println(Arrays.toString(a));
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        // Example 1
        String input1 = "aba";
        String input2 = "ababa";
        System.out.println(input1);
        System.out.println(input2);
        int result1 = findLCSLength(input1, input2);
        System.out.println("Example 1 Output: " + result1); // Output: 3

        // Example 2
        String input3 = "aggtab";
        String input4 = "gxtxayb";
        System.out.println(input3);
        System.out.println(input4);
        int result2 = findLCSLength(input3, input4);
        System.out.println("Example 2 Output: " + result2); // Output: 4
    }
}
