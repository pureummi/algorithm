package baekjoonStep8;

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
		
		for (int i = m; i <= n; i++) {
			int[] cnt = new int[n];
			for (int k = 1; k <= i; k++) {
				if (i % k == 0) {
					cnt[k-1] = i / k;
				} 
			}
			
			int zero = 0;
			for (int l = 0; l < cnt.length; l++) {
				if (cnt[l] == 0) {
					zero++;
				}
			}
			
			if (cnt.length - zero == 2) {
				System.out.println(i);
			}
		}
		
		br.close();
	}
}
