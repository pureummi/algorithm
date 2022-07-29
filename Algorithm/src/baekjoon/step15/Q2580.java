package baekjoon.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2580 {
	static int[][] arr = new int[9][9];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 9; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(str.nextToken());
			}
		}

		sudoku(0, 0);
	}

	static void sudoku(int row, int col) {
		if (col == 9) {
			sudoku(row + 1, 0);
			return;
		}
		
		if (row == 9) {
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(arr[i][j]).append(' ');
				}
				
				sb.append('\n');
			}
			
			System.out.println(sb);
			
			System.exit(0);
		}
		
		if (arr[row][col] == 0) {
			for (int i = 1; i <= 9; i++) {
				if (check(row, col, i)) {
					arr[row][col] = i;
					sudoku(row, col + 1);
				}
			}
			
			arr[row][col] = 0;
			return;
		}
		
		sudoku(row, col + 1);
	}

	static boolean check(int row, int col, int n) {
		for (int i = 0; i < 9; i++) {
			if (arr[row][i] == n) {
				return false;
			}
		}
		
		for (int i = 0; i < 9; i++) {
			if (arr[i][col] == n) {
				return false;
			}
		}
		
		int rowTemp = (row / 3) * 3;
		int colTemp = (col / 3) * 3;
		
		for (int i = rowTemp; i < rowTemp + 3; i++) {
			for (int j = colTemp; j < colTemp + 3; j++) {
				if (arr[i][j] == n) {
					return false;
				}
			}
		}
		
		return true;
	}

}
