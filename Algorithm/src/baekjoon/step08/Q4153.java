package baekjoon.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			int c = Integer.parseInt(str.nextToken());
			
			if (a == 0 && b == 0 && c == 0) break;
				
			if ((a * a) == (b * b) + (c * c)) {
				sb.append("right" + "\n");
			
			} else if ((b * b) == (a * a) + (c * c)) {
				sb.append("right" + "\n");
			
			} else if ((c * c) == (a * a) + (b * b)) {
				sb.append("right" + "\n");
			
			} else {
				sb.append("wrong" + "\n");
			}
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
