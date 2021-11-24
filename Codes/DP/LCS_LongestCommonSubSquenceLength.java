package DP;

import java.util.Scanner;

public class LCS_LongestCommonSubSquenceLength {

//-- LCS FUNCTION ----------------------------------------------------------------
	public static int lcs(String s1, String s2) {
		int dp[][] = new int[s1.length() + 1][s2.length() + 1];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = -1;
			}
		}
		return lcsMEM(s1, s2, dp);
//		return lcsREC(s1 , s2 , 0 , 0 );
//		return lcsI(s1,s2);
	}

//__ITERATIVE_______________________________________________________
	public static int lcsI(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();

		int[][] dp = new int[m + 1][n + 1];

		for (int i = m - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				int ans;
				if (s1.charAt(i) == s2.charAt(j)) {
					ans = 1 + dp[i + 1][j + 1];
				} else {
					int ans1 = dp[i][j + 1];
					int ans2 = dp[i + 1][j];
					ans = Math.max(ans1, ans2);
				}
				dp[i][j] = ans;
			}
		}
		return dp[0][0];
	}

//__MEMOIZATION______________________________________________________
	public static int lcsMEM(String s1, String s2, int[][] dp) {

		int m = s1.length();
		int n = s2.length();

		if (dp[m][n] > 0) {
			return dp[m][n];
		}

		if (m == 0 || n == 0) {
			dp[m][n] = 0;
			return dp[m][n];
		}
		if (s1.charAt(0) == s2.charAt(0)) {
			dp[m][n] = 1 + lcsMEM(s1.substring(1), s2.substring(1), dp);
			return dp[m][n];

		} else {
			int l1 = lcsMEM(s1.substring(1), s2, dp);
			int l2 = lcsMEM(s1, s2.substring(1), dp);
			dp[m][n] = Math.max(l1, l2);
			return dp[m][n];
		}
	}

//__ RECURSIVE_________________________________________________________________
	static int myAns = 0;

	public static int lcsREC(String s1, String s2, int i, int j) {

		if (i == s1.length() || j == s2.length()) {
			return 0;
		}
		if (s1.charAt(i) == s2.charAt(j)) {
			int ans = lcsREC(s1, s2, i + 1, j + 1);
			myAns = 1 + ans;
		} else {
			int l1 = lcsREC(s1, s2, i + 1, j);
			int l2 = lcsREC(s1, s2, i, j + 1);
			myAns = Math.max(l1, l2);
		}
		return myAns;
	}

//-- MAIN METHOD -----------------------------------------------------------------
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String s1 = s.nextLine();
		String s2 = s.nextLine();
		int ans = lcs(s1, s2);
		System.out.println(ans);
	}
}
