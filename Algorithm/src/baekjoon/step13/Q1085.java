package baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(str.nextToken());
		int y = Integer.parseInt(str.nextToken());
		
		int w = Integer.parseInt(str.nextToken());
		int h = Integer.parseInt(str.nextToken());
		
		int minX = Math.min(x, Math.max(x-w, w-x));
		int minY = Math.min(y, Math.max(y-h, h-y));
		
		System.out.println(Math.min(minX, minY));
		
		br.close();
	}
}
