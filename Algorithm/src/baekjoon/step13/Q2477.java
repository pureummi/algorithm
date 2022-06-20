package baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2477 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		
		//전체 밭의 가로 세로 길이
		int weight = 0;
		int height = 0;
		
		int[][] array = new int[6][2];
		for (int i = 0; i < 6; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			int way = Integer.parseInt(str.nextToken());
			int length = Integer.parseInt(str.nextToken());
			
			if (way == 1 || way == 2) {//동서 방향은 가로
				weight = Math.max(weight, length);
				
			} else if (way == 3 || way == 4) {//남북 방향은 세로
				height = Math.max(height, length);
			}
			
			array[i][0] = way;
			array[i][1] = length;
		}
		
		//참외밭 외의 가짜 밭의 가로 세로 길이
		int weightM = 0;
		int heightM = 0;
		
		for (int i = 1; i < 6; i++) {
			if (array[i-1][0] == 1) {
				if (array[i][0] != 4) {
					weightM = array[i-1][1];
					heightM = array[i][1];
				}
				
			} else if (array[i-1][0] == 2) {
				if (array[i][0] != 3) {
					weightM = array[i-1][1];
					heightM = array[i][1];
				}
				
			} else if (array[i-1][0] == 3) {
				if (array[i][0] != 1) {
					weightM = array[i][1];
					heightM = array[i-1][1];
				} 
				
			} else if (array[i-1][0] == 4) {
				if (array[i][0] != 2) {
					weightM = array[i][1];
					heightM = array[i-1][1];
				} 
			}
			
		}
		
		if (weightM == 0 && heightM == 0) {
			weightM = array[0][1];
			heightM = array[5][1];
		}
		
		//진짜 참외밭의 넓이 = 전체 밭의 넓이 - 가짜 밭의 넓이
		System.out.println(((weight*height) - (weightM*heightM)) * k);
		
		br.close();
	}
}
