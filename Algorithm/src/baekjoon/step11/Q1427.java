package baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String n = br.readLine();
		
		int[] array = new int[n.length()];
		for (int i = 0; i < n.length(); i++) {
			int value = Integer.parseInt(n.substring(i,i+1));
			array[i] = value;
		}

		int temp = 0;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 1; j < array.length-i; j++) {
				if (array[j-1] < array[j]) {
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for (int i : array) {
			System.out.print(i);
		}
		
		br.close();
	}
}
