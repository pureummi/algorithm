package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2609 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(str.nextToken());
		int b = Integer.parseInt(str.nextToken());
		
		int divisor = 1;
		int max = 0;
		
		while (a > divisor || b > divisor) {
			
			if (a % divisor == 0 && b % divisor == 0) {
				max = Math.max(max, divisor);
				
			}
			
			divisor++;
		}
		
		System.out.println(max);
		System.out.println(max * (a/max) * (b/max));
		
		br.close();
	}
}
