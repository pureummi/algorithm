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
		for (int i = 1; i < n; i++) {
			int targetY = y[i];
			int targetX = x[i];
			String targetXY = xy[i];
			int j = i-1;
			
			while (j >= 0 && y[j] > targetY) {
				y[j+1] = y[j];
				x[j+1] = x[j];
				xy[j+1] = xy[j];
				j--;
			}
			
			y[j+1] = targetY;
			x[j+1] = targetX;
			xy[j+1] = targetXY;
		}
		
		//y값이 같을 때, x값을 기준으로 xy값 정렬
		for (int i = 1; i < n; i++) {
			int targetX = x[i];
			String targetXY = xy[i];
			int j = i-1;
			
			while (j >= 0 && x[j] > targetX
					&& y[j] == y[j+1]) {
				x[j+1] = x[j];
				xy[j+1] = xy[j];
				j--;
			}
			
			x[j+1] = targetX;
			xy[j+1] = targetXY;
		}
		
		for (String s : xy) {
			System.out.println(s);
		}
		
		br.close();
	}
}
