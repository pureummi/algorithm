package baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2750 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 1; i < n; i++) {
			int target = array[i];
			int j = i - 1;
			
			while (j >= 0 && array[j] > target) {
				array[j+1] = array[j];
				j--;
			}
			
			array[j+1] = target;
		}
		
		for (int i : array) {
			System.out.println(i);
		}
		
		br.close();
	}
}
