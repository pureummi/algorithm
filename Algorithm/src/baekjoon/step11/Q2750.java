package baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2750 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		for (int i : array) {
			System.out.println(i);
		}
		
		br.close();
	}
}
