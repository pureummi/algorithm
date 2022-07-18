package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11050 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(str.nextToken());
		int k = Integer.parseInt(str.nextToken());
		
		System.out.println(binomial_coefficient(n, k));
	}
	
	public static int binomial_coefficient(int n, int k) {
		if (k == 0 || k == n) return 1;
		
		return binomial_coefficient(n-1, k-1) + binomial_coefficient(n-1, k);	
	}
}
