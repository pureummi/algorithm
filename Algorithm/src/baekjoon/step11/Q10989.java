package baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] array = new int[n];
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, array[i]);
		}
		
		int[] counting = new int[max+1];
		for (int i = 0; i < array.length; i++) {
			int idx = array[i];
			counting[idx]++; 
		}
		
		for (int i = 1; i < counting.length; i++) {
			counting[i] += counting[i-1]; 
		}
		
		int[] result = new int[array.length];
		for (int i = array.length-1; i >= 0; i--) {
			int idx = array[i];
			counting[idx] = counting[idx]-1;
			result[counting[idx]] = array[i];
			
		}
		
		for (int i : result) {
			System.out.println(i);
		}
		
		br.close();
	}
}
