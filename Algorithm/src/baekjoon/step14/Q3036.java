package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3036 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(str.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		
		int first = arr[0];
		
		for (int i = 1; i < n; i++) {
			int divisor = gcd(first,arr[i]);
			sb.append(first/divisor).append('/').append(arr[i]/divisor).append('\n');
		}
		
		System.out.println(sb);
		
		br.close();
	}
	
	public static int gcd(int p, int q) {
		if (q == 0) return p;
		return gcd(q, p%q);
	}
}
