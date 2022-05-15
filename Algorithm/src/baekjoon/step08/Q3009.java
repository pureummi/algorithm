package baekjoon.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int resultX = 0;
		int resultY = 0;
		
		//XOR ¿¬»êÀÚ
		for (int i = 0; i < 3; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(str.nextToken());
			int y = Integer.parseInt(str.nextToken());
		
			resultX ^= x;
			resultY ^= y;
		}
		
		System.out.println(resultX + " " + resultY);
		
		br.close();
	}
}
