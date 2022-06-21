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
		
		for (int i = 0; i < t; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(str.nextToken());
			y1 = Integer.parseInt(str.nextToken());
			x2 = Integer.parseInt(str.nextToken());
			y2 = Integer.parseInt(str.nextToken());
			
			int n = Integer.parseInt(br.readLine());
			
			for (int j = 0; j < n; j++) {
				str = new StringTokenizer(br.readLine());
				
				int c1 = Integer.parseInt(str.nextToken());
				int c2 = Integer.parseInt(str.nextToken());
				int r = Integer.parseInt(str.nextToken());
				
				System.out.println("c1 : " + c1);
				System.out.println("c2 : " + c2);
				System.out.println("r : " + r);
			}
			
			System.out.println("x1 : " + x1);
			System.out.println("y1 : " + y1);
			System.out.println("x2 : " + x2);
			System.out.println("y2 : " + y2);
		}
	}
}
