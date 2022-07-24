package baekjoon.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15650 {
	static int[] arr;
	static int n;
	static int m;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer str = new StringTokenizer(br.readLine());

		n = Integer.parseInt(str.nextToken());
		m = Integer.parseInt(str.nextToken());

		arr = new int[m];

		backtracking(1, 0);

		System.out.println(sb);
	}

	static void backtracking(int start ,int idx) {
		if (idx == m) {
			for (int i = 0; i < m; i++) {
				sb.append(arr[i]).append(' ');
			}
			sb.append('\n');
			return;

		} else {
			for (int i = start; i <= n; i++) {

				arr[idx] = i;
				backtracking(start+1, idx+1);

			}
		}
	}
}
