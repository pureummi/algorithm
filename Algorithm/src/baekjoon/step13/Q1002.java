package baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1002 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());

			int x1 = Integer.parseInt(str.nextToken());
			int y1 = Integer.parseInt(str.nextToken());
			int r1 = Integer.parseInt(str.nextToken());
			
			int x2 = Integer.parseInt(str.nextToken());
			int y2 = Integer.parseInt(str.nextToken());
			int r2 = Integer.parseInt(str.nextToken());
			
			if (Math.abs(x2-x1) + Math.abs(y2-y1) > Math.abs(r1+r2)
					|| (x1 == x2 && y1 == y2 && r1 != r2)) {
				sb.append("0").append('\n');
				
			} else if (Math.abs(x2-x1) + Math.abs(y2-y1) == Math.abs(r1+r2)
					|| Math.abs(x2-x1) + Math.abs(y2-y1) == Math.abs(r2-r1)) {
				sb.append("1").append('\n');
				
			} else if (Math.abs(x2-x1) + Math.abs(y2-y1) < Math.abs(r1+r2)) {
				sb.append("2").append('\n');
				
			} else {
				sb.append("-1").append('\n');
				
			}
			
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
