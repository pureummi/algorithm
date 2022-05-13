package baekjoonStep10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
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
		while (row-8 >= 0 && column-8 >= 0) {
			//w : 32, b : 32
			int w1 = 0;
			int b1 = 0;
			int w2 = 0;
			int b2 = 0;

			for (int i = row-1; i >= row-8; i--) {
				for (int j = column-1; j >= column-8; j--) {
					
					if ((i % 2 == 0 && j % 2 == 0) ||
							(i % 2 != 0 && j % 2 != 0)) {
						if (board[i][j] == 'W') {
							w1++;
						} else if (board[i][j] == 'B') {
							b2++;
						}
					}
					
					if ((i % 2 == 0 && j % 2 != 0) ||
							(i % 2 != 0 && j % 2 == 0)) {
						if (board[i][j] == 'W') {
							w2++;
						} else if (board[i][j] == 'B') {
							b1++;
						}
					} 
				}
			}

			System.out.println("w1 : " + w1 + ", b1 : " + b1);
			System.out.println("w2 : " + w2 + ", b2 : " + b2);
			row--;
			column--;
		}
		
		br.close();
	}
}
