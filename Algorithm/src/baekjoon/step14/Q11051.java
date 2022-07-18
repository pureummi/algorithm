package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11051 {
	static int[][] dp;
	public static final int div = 10007;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(str.nextToken());
		int k = Integer.parseInt(str.nextToken());
		
		dp = new int[n+1][k+1];
		
		System.out.println(binomial_coefficient(n, k));
	}
	
	public static int binomial_coefficient(int n, int k) {
		if (dp[n][k] > 0) {
			return dp[n][k];
		}
		
		if (k == 0 || k == n) {
			return dp[n][k] = 1;
		}
		
		return dp[n][k] = (binomial_coefficient(n-1, k-1) + binomial_coefficient(n-1, k)) % div;
	}
}
