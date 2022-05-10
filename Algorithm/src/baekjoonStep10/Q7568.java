package baekjoonStep10;

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
		int topWeight = 0, topHeight = 0;
		for (int i = 0; i < n; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			weight[i] = Integer.parseInt(str.nextToken());
			height[i] = Integer.parseInt(str.nextToken());
			topWeight = Math.max(weight[i], topWeight);
			topHeight = Math.max(height[i], topHeight);
		}

		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				
			}
		}
		
		System.out.println(topWeight);
		System.out.println(topHeight);


	}
}
