package baekjoonStep7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		int[] result = new int[input]; 
		for (int i = 0; i < input; i++) {
			int k = Integer.parseInt(br.readLine()); //Ãþ
			int n = Integer.parseInt(br.readLine()); //È£
			
			int[][] room = new int[k+1][n];

			for (int x = 0; x <= k; x++) {//Ãþ
				for (int y = 0; y <= n-1; y++) {//È£
					if (x == 0) {
						room[x][y] = y + 1;
						
					} else if (x > 0) {
						int temp = 0;
						for (int o = y; o >= 0; o--) {
							temp += room[x-1][o];
						}
						
						room[x][y] = temp;
					}
				}
			}
			
			result[i] = room[k][n-1];
		}
		
		for (int i : result) {
			System.out.println(i);
		}
		
		br.close();
	}
}
