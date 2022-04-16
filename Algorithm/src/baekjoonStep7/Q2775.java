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

			for (int j = 0; j <= k; j++) {//Ãþ
				int cnt = 0;
				
				for (int m = 0; m <= n-1; m++) {//È£
					cnt++;
					room[j][m] = cnt;
					room[j][0] = 1;
					int temp = 0;
					if (j > 0) {
						for (int o = m; o >= 0; o--) {
							temp += room[j-1][o];
						}
						
						room[j][m] = temp;
					}
				}
			}
			
			result[i] = room[k][n-1];
		}
		
		for (int i : result) {
			System.out.println(i);
		}
	}
}
