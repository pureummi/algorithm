package baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11650 {
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
 		
 		//x값을 기준으로 정렬
 		for (int i = 1; i < n; i++) {
 			int targetX = x[i];
 			int targetY = y[i];
 			String targetXY = xy[i];
 			int j = i-1;
 			
 			while (j >= 0 && x[j] > targetX) {
 				x[j+1] = x[j];
 				y[j+1] = y[j];
 				xy[j+1] = xy[j];
 				j--;
 			}
 			
 			x[j+1] = targetX;
 			y[j+1] = targetY;
 			xy[j+1] = targetXY;
 		}
 		
 		//x의 값이 같을 때, y값을 기준으로 정렬
 		for (int i = 1; i < n; i++) {
 			int targetX = x[i];
 			int targetY = y[i];
 			String targetXY = xy[i];
 			int j = i-1;
 			
 			while (j >= 0 && targetX == x[j] && y[j] > targetY) {
 				xy[j+1] = xy[j];
 				j--;
 			}
 			
 			xy[j+1] = targetXY;
 		}
 		
 		for (String s : xy) {
 			System.out.println(s);
 		}
 		
 		br.close();
	}
}
