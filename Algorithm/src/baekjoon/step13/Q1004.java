package baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1004 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int x1, y1, x2, y2;
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			x1 = Integer.parseInt(str.nextToken());
			y1 = Integer.parseInt(str.nextToken());
			x2 = Integer.parseInt(str.nextToken());
			y2 = Integer.parseInt(str.nextToken());
			
			int n = Integer.parseInt(br.readLine());
			int cnt = 0;
			
			for (int j = 0; j < n; j++) {
				str = new StringTokenizer(br.readLine());
				
				int c1 = Integer.parseInt(str.nextToken());
				int c2 = Integer.parseInt(str.nextToken());
				int r = Integer.parseInt(str.nextToken());
				
				int distance1 = (int)Math.pow(c1-x1, 2) + (int)Math.pow(c2-y1, 2);
				int distance2 = (int)Math.pow(c1-x2, 2) + (int)Math.pow(c2-y2, 2);
				
				//하나의 원 안에 출발점과 도착점이 모두 존재하는 경우는 횟수에 포함되면 X
				if (!(distance1 < Math.pow(r, 2) && distance2 < Math.pow(r, 2)) 
						&& (distance1 < Math.pow(r, 2) || distance2 < Math.pow(r, 2))) {
					
					cnt++;
				}
			}
			
			sb.append(cnt).append('\n');
		}
		
		System.out.println(sb.toString().trim());
		
		br.close();
	}
}
