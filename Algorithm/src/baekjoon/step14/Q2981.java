package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2981 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);
		
		int value = arr[1] - arr[0];
		
		for (int i = 2; i < arr.length; i++) {
			value = gcd(value, arr[i] - arr[i-1]);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 2; i <= value; i++) {
			if (value % i == 0) {
				sb.append(i).append(' ');
			}
		}
		
		System.out.println(sb);
		
		br.close();

	}
	
	public static int gcd(int p, int q) {
		if (q == 0) return p;
		 
		return gcd(q, p%q);
	}
}
