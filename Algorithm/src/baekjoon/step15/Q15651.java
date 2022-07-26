package baekjoon.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15651 {
	static int[] arr;
	static int n, m;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer str = new StringTokenizer(br.readLine());

		n = Integer.parseInt(str.nextToken());
		m = Integer.parseInt(str.nextToken());

		arr = new int[m];

		backtracking(0);

		System.out.println(sb);
	}

	static void backtracking(int idx) {
		if (idx == m) {
			for (int i : arr) {
				sb.append(i).append(' ');
			}
			sb.append('\n');
			return;

		} else {
			for (int i = 0; i < n; i++) {
				arr[idx] = i+1;
				backtracking(idx+1);
			}
		}
	}
}
