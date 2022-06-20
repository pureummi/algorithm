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
			
			sb.append(point(x1, y1, r1, x2, y2, r2)).append('\n');			
		}
		
		System.out.println(sb.toString().trim());
		
		br.close();
	}
	
	public static int point(int x1, int y1, int r1, int x2, int y2, int r2) {
		int distance = (int) (Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		
		if (x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
			
		} else if (distance > Math.pow(r1+r2, 2)
				|| distance < Math.pow(r2-r1, 2)) {
			return 0;
			
		} else if (distance == Math.pow(r1+r2, 2)
				|| distance == Math.pow(r2-r1, 2)) {
			return 1;
			
		} else {
			return 2;
			
		}
	}
}	