package baekjoonStep10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1018 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(str.nextToken());

		char[][] board = new char[n][m];
		for (int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		int row = n;
		int column = m;
		int result = 32; //w와 b은 각각 32개여야 함.(8 * 8 = 64) 고쳐야 할 정사각형을 최대값인 32로 설정.
		while (row-8 >= 0 && column-8 >= 0) {
			//w : 32, b : 32
			//WB일 경우 w1, b1 / BW일 경우 w2, b2
			int w1 = 0, b1 = 0;
			int w2 = 0, b2 = 0;

			for (int i = row-1; i >= row-8; i--) {
				for (int j = column-1; j >= column-8; j--) {
					
						if ((i % 2 == 0 && j % 2 == 0) ||
								(i % 2 != 0 && j % 2 != 0)) {//[0][0],[0][2],[1][1],[1][3]
							if (board[i][j] == 'W') {
								w1++;
							} else if (board[i][j] == 'B') {
								b2++;
							}
						}
						
						if ((i % 2 == 0 && j % 2 != 0) ||
								(i % 2 != 0 && j % 2 == 0)) {//[0][1],[0][3],[1][0],[1][2]
							if (board[i][j] == 'W') {
								w2++;
							} else if (board[i][j] == 'B') {
								b1++;
							}
						} 
				}
				
			}

			//고쳐야 할 정사각형의 개수
			int min1 = (32 - w1) + (32 - b1);
			int min2 = (32 - w2) + (32 - b2);
			
			result = Math.min(min1, result);
			result = Math.min(min2, result);
			
			if (column - 8 == 0) {
				column = m;
				row--;
				
			} else {
				column--;
				
			}
		}
		
		System.out.println(result);
		
		br.close();
	}
}
