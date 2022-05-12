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

		//w : 32, b : 32
		int w = 0;
		int b = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i % 2 == 0 && j % 2 == 0) {
					if (board[i][j] == 'W') {
						w++;
					} else if (board[i][j] == 'B') {
						b++;
					}
				} else if (i % 2 != 0 && j % 2 != 0) {
					if (board[i][j] == 'W') {
						w++;
					} else if (board[i][j] == 'B') {
						b++;
					}
				}
			}
		}
		System.out.println("w : " + w + ", b : " + b);

		br.close();
	}
}
