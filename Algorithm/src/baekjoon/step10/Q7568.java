package baekjoon.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7568 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] weight = new int[n];
		int[] height = new int[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			weight[i] = Integer.parseInt(str.nextToken());
			height[i] = Integer.parseInt(str.nextToken());
		}

		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			int rank = 1;
			for (int j = 0; j < n; j++) {
				if (weight[i] < weight[j] && height[i] < height[j]) {
					rank++;
				}
			}
			sb.append(rank + " ");
		}
		
		System.out.println(sb.substring(0, sb.length()-1));
		
		br.close();
	}
}
