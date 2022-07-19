package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1010 {
	static int[][] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(str.nextToken());
			int m = Integer.parseInt(str.nextToken());
			
			dp = new int[n+1][m+1];
			
			sb.append(bridge(n, m)).append('\n');
		}
		
		System.out.println(sb);
	}
	
	public static int bridge(int n, int m) {
		if (dp[n][m] > 0) return dp[n][m];
		
		if (n == 0 || n == m) return 1;
		
		return dp[n][m] = bridge(n-1, m-1) + bridge(n, m-1);
	}
}
