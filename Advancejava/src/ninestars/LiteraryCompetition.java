package ninestars;

import java.util.Arrays;

public class LiteraryCompetition {
    public static int maxPoints(int N, int T, int[] points, int[] time) {
        int[][] dp = new int[N + 1][T + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= T; j++) {
                if (time[i - 1] <= j) {
                	if(j==4 && i==3) {
                		System.out.println(time[i - 1]);
                	}
                    dp[i][j] = Math.max(dp[i - 1][j], points[i - 1] + dp[i - 1][j - time[i - 1]]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        for(int []a:dp) {
        	System.out.println(Arrays.toString(a));
        }
        return dp[N][T];
    }
    static long maxPoint(int N, int K, int A[], int B[])
    {
        long ans = 0;

        for (int i = 0; i < N; i++) {
            long points = (K / A[i]) * B[i];
            System.out.println((K / A[i])+"  "+B[i]+"  "+points);
            ans = Math.max(ans, points);
        }

        return ans;
    }
    public static void main(String[] args) {
        int N1 = 3;
        int T1 = 7;
        int[] points1 = {2, 6,7, 9};
        int[] time1 = {3, 4,4, 3};
        System.out.println(maxPoints(N1, T1, points1, time1)); // Output: 11
         

//        int N2 = 2;
//        int T2 = 5;
//        int[] points2 = {2, 4};
//        int[] time2 = {3, 5};
//        System.out.println(maxPoints(N2, T2, points2, time2)); // Output: 4
    }
}
