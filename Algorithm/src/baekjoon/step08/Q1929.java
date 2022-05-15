package baekjoon.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(str.nextToken());
		int n = Integer.parseInt(str.nextToken());
		
		boolean[] check = new boolean[n+1];
		check[0] = check[1] = false;
		
		for (int i = 2; i <= n; i++) {
			check[i] = true;
 		}
		
		for (int i = 2; i <= n; i++) {
			if (!check[i]) continue;
			for (int j = i * 2; j <= n; j += i) {
				check[j] = false;
			}
		}
		
		for (int i = m; i <= n; i++) {
			if (check[i]) {
				System.out.println(i);
			}
		}
		
		br.close();
	}
}
