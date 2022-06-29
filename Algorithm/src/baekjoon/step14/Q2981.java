package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2981 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			min = Math.min(min, arr[i]);
		}

		int idx = 1;
		int divisor = 2;
		int checkcnt = 0;

		StringBuilder sb = new StringBuilder();

		while (idx <= n-1 && divisor <= min) {
			int result = arr[0] % divisor;
			int remainder = arr[idx] % divisor;

			if (result == remainder) {
				idx++;
				checkcnt++;
				
			} else {
				divisor++;
				checkcnt = 0;
				idx = 1;
			}

			if (checkcnt == n-1) {
				sb.append(divisor).append(' ');
				divisor++;
				idx = 1;
				checkcnt = 0;
			}
			
		}
		
		System.out.println(sb);
		
		br.close();

	}
}
