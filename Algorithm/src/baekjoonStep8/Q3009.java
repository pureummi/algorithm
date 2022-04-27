package baekjoonStep8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arrayX = new int[3];
		int[] arrayY = new int[3];
		
		int resultX = 0;
		int resultY = 0;
		
		for (int i = 0; i < 3; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(str.nextToken());
			int y = Integer.parseInt(str.nextToken());
			arrayX[i] = x;
			arrayY[i] = y;
			resultX += x;
			resultY += y;
		}
		
		for (int i = 0; i < arrayX.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arrayX[i] == arrayX[j]) {
					resultX -= (arrayX[i]*2);
				}
			}
			
			for (int j = 0; j < i; j++) {
				if (arrayY[i] == arrayY[j]) {
					resultY -= (arrayY[i]*2);
				}
			}
		}
		
		System.out.println(resultX + " " + resultY);
		
		br.close();
	}
}
