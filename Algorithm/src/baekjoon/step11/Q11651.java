package baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11651 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] xy = new String[n];
		int[] x = new int[n];
		int[] y = new int[n];
		
		for (int i = 0; i < n; i++) {
			xy[i] = br.readLine();
			StringTokenizer str = new StringTokenizer(xy[i]);
			x[i] = Integer.parseInt(str.nextToken());
			y[i] = Integer.parseInt(str.nextToken());
		}
		
		//y값을 기준으로 x값과 xy값 정렬
		int tempY = 0;
		int tempX = 0;
		String tempXY = "0";
		for (int i = 0; i < y.length-1; i++) {
			for (int j = 1; j < y.length-i; j++) {
				if (y[j-1] > y[j]) {
					tempY = y[j-1];
					y[j-1] = y[j];
					y[j] = tempY;
					
					tempX = x[j-1];
					x[j-1] = x[j];
					x[j] = tempX;
					
					tempXY = xy[j-1];
					xy[j-1] = xy[j];
					xy[j] = tempXY;
				}
			}
		}
		
		//y값이 같을 때, x값을 기준으로 xy값 정렬
		for (int i = 0; i < x.length-1; i++) {
			for (int j = 1; j < x.length-i; j++) {
				if (y[j-1] == y[j] && x[j-1] > x[j]) {
					tempX = x[j-1];
					x[j-1] = x[j];
					x[j] = tempX;
					
					tempXY = xy[j-1];
					xy[j-1] = xy[j];
					xy[j] = tempXY;
				}
			}
		}
		
		for (String s : xy) {
			System.out.println(s);
		}
		
		br.close();
	}
}
