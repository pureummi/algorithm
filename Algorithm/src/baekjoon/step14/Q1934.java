package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1934 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			
			int divisor = 1;
			int max = 0;
			
			while (a >= divisor && b >= divisor) {
				
				if (a % divisor == 0 && b % divisor == 0) {
					max = Math.max(max, divisor);
				}
				
				divisor++;
			}
			
			sb.append(max * (a/max) * (b/max)).append('\n');
		}
		
		System.out.println(sb.toString().trim());
		
		br.close();
	}
}
