package baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String n = br.readLine();

		int[] array = new int[n.length()];
		int max = 0;
		for (int i = 0; i < n.length(); i++) {
			int value = Integer.parseInt(n.substring(i,i+1));
			array[i] = value;

			if (value > max) max = value;
		}

		int[] counting = new int[max+1];
		for (int i = 0; i < array.length; i++) {
			counting[array[i]]++;
		}
		
		for (int i = 1; i < counting.length; i++) {
			counting[i] += counting[i-1]; 
		}
		
		int[] result = new int[array.length];
		for (int i = result.length-1; i >= 0; i--) {
			counting[array[i]] = counting[array[i]]-1;
			result[counting[array[i]]] = array[i];
		}

		for (int i = result.length-1; i >= 0; i--) {
			System.out.print(result[i]);
		}

		br.close();
	}
}
