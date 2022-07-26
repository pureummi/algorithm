package baekjoon.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9663 {
	static int[] arr;
	static int n;
	static int cnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		arr = new int[n];

		backtracking(0);

		System.out.println(cnt);;
	}

	static void backtracking(int idx) {
		if (idx == n) {
			cnt++;
			return;

		} else {
			for (int i = 0; i < n; i++) {
				arr[idx] = i;

				if (check(idx)) backtracking(idx + 1);
			}
		}
	}

	static boolean check(int idx) {
		for (int i = 0; i < idx; i++) {
			if (arr[idx] == arr[i]
					|| Math.abs(idx - i) == Math.abs(arr[idx] - arr[i])) {

				return false;
			} 
		}

		return true;
	}
}
