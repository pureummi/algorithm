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

		for (int i = 1; i < array.length; i++) {
			int target = array[i];
			int j = i - 1;
			
			while (j >= 0 && array[j] < target) {
				array[j+1] = array[j];
				j--;
			}
			
			array[j+1] = target;
		}
		
		for (int i : array) {
			System.out.print(i);
		}
		
		br.close();
	}
}
