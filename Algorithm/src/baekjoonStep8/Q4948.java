package baekjoonStep8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Q4948 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();

		while (true) {

			int n = Integer.parseInt(br.readLine());
			int[] check = new int[n+1];

			if (n != 0) {
				for (int i = 2; i <= n; i++) {
					check[i] = i;
				}

				for (int i = 2; i <= n; i++) {
					if (check[i] == 0) continue;
					for (int j = i * i; j <= n; j += i) {
						check[j] = 0;
					}
				}

				sb.append("{");
				for (int i = 2; i < check.length; i++) {
					if (check[i] != 0) {
						sb.append(check[i]);
						sb.append(",");

					}
				}
				
				sb.setCharAt(sb.length()-1, '}');

			}else {
				break;
			}
		}

		System.out.println(sb.toString());
	}
}
